import java.awt.*;
import javax.swing.*;

public class SudokuUI {
    private SudokuGame game;
    private JFrame frame;
    private JTextField[][] cells;

    public SudokuUI(SudokuGame game) {
        this.game = game;
        createUI();
    }

    private void createUI() {
        frame = new JFrame("Sudoku");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 700);
        frame.setLayout(new BorderLayout());

        JPanel boardPanel = new JPanel(new GridLayout(9, 9));
        cells = new JTextField[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                JTextField tf = new JTextField();
                tf.setHorizontalAlignment(JTextField.CENTER);
                tf.setFont(new Font("Arial", Font.BOLD, 20));

                if (game.isFixed(i, j)) {
                    tf.setText(String.valueOf(game.getNumber(i, j)));
                    tf.setEditable(false);
                    tf.setBackground(Color.LIGHT_GRAY);
                } else {

                    int num = game.getNumber(i, j);
                    if (num != 0)
                        tf.setText(String.valueOf(num));

                    final int row = i;
                    final int col = j;

                    tf.addKeyListener(new java.awt.event.KeyAdapter() {
                        @Override
                        public void keyTyped(java.awt.event.KeyEvent e) {
                            char c = e.getKeyChar();
                            e.consume();

                            if (c >= '1' && c <= '9') {
                                int num = c - '0';
                                if (game.setNumber(row, col, num)) {
                                    tf.setText(String.valueOf(num));
                                } else {
                                    JOptionPane.showMessageDialog(frame, "Movimento inválido!");
                                }
                            } else if (c == '\b' || c == 127) { // backspace/delete
                                game.removeNumber(row, col);
                                tf.setText("");
                            }
                        }
                    });
                }

                cells[i][j] = tf;
                boardPanel.add(tf);
            }
        }

        frame.add(boardPanel, BorderLayout.CENTER);

        // Painel de botões
        JPanel controlPanel = new JPanel(new GridLayout(7, 1, 5, 5));

        JButton btnSet = new JButton("Colocar número");
        btnSet.addActionListener(e -> placeNumber());

        JButton btnRemove = new JButton("Remover número");
        btnRemove.addActionListener(e -> removeNumber());

        JButton btnCheck = new JButton("Verificar jogo");
        // atualiza visual
        btnCheck.addActionListener(e -> {
            updateBoard();
            if (game.hasErrors()) {
                JOptionPane.showMessageDialog(frame, "O jogo contém erros!");
            } else {
                JOptionPane.showMessageDialog(frame, "O jogo não contém erros!");
            }
        });

        JButton btnStatus = new JButton("Verificar status");
        btnStatus.addActionListener(e -> checkStatus());

        JButton btnClear = new JButton("Limpar");
        btnClear.addActionListener(e -> clearBoard());

        JButton btnExit = new JButton("Finalizar jogo");
        btnExit.addActionListener(e -> finishGame());

        controlPanel.add(btnSet);
        controlPanel.add(btnRemove);
        controlPanel.add(btnCheck);
        controlPanel.add(btnStatus);
        controlPanel.add(btnClear);
        controlPanel.add(btnExit);

        frame.add(controlPanel, BorderLayout.EAST);

        frame.setVisible(true);
    }

    private void updateBoard() {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                cells[i][j].setText(game.getNumber(i, j) == 0 ? "" : String.valueOf(game.getNumber(i, j)));
    }

    private void placeNumber() {
        try {
            int row = Integer.parseInt(JOptionPane.showInputDialog("Linha (0-8):"));
            int col = Integer.parseInt(JOptionPane.showInputDialog("Coluna (0-8):"));
            int num = Integer.parseInt(JOptionPane.showInputDialog("Número (1-9):"));
            if (game.setNumber(row, col, num)) {
                updateBoard();
            } else {
                JOptionPane.showMessageDialog(frame, "Posição inválida!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, "Entrada inválida!");
        }
    }

    private void removeNumber() {
        try {
            int row = Integer.parseInt(JOptionPane.showInputDialog("Linha (0-8):"));
            int col = Integer.parseInt(JOptionPane.showInputDialog("Coluna (0-8):"));
            if (game.removeNumber(row, col)) {
                updateBoard();
            } else {
                JOptionPane.showMessageDialog(frame, "Número fixo não pode ser removido!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, "Entrada inválida!");
        }
    }

    private void checkStatus() {
        String status;
        boolean emptyBoard = true;
        for (int i = 0; i < 9 && emptyBoard; i++)
            for (int j = 0; j < 9 && emptyBoard; j++)
                if (game.getNumber(i, j) != 0)
                    emptyBoard = false;

        if (emptyBoard)
            status = "Não iniciado";
        else if (game.isComplete())
            status = "Completo";
        else
            status = "Incompleto";

        boolean error = game.hasErrors();
        JOptionPane.showMessageDialog(frame, "Status: " + status + "\nErros: " + (error ? "Sim" : "Não"));
    }

    private void clearBoard() {
        game.clearUserNumbers();
        updateBoard();
    }

    private void finishGame() {
        if (game.isComplete() && !game.hasErrors()) {
            JOptionPane.showMessageDialog(frame, "Parabéns! Sudoku completo e correto!");
            frame.dispose();
        } else {
            JOptionPane.showMessageDialog(frame, "O jogo não está completo ou contém erros!");
        }
    }
}