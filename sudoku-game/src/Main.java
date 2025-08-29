public class Main {
    public static void main(String[] args) {
        int[][] initialBoard = new int[9][9];
        boolean[][] fixedCells = new boolean[9][9];

        if (args.length > 0) {
            for (String arg : args) {
                // formato esperado: "col,row;num,isFixed"
                try {
                    String[] parts = arg.split(";");
                    String[] pos = parts[0].split(",");
                    int col = Integer.parseInt(pos[0]);
                    int row = Integer.parseInt(pos[1]);

                    String[] numFixed = parts[1].split(",");
                    int num = Integer.parseInt(numFixed[0]);
                    boolean isFixed = Boolean.parseBoolean(numFixed[1]);

                    initialBoard[row][col] = num;
                    fixedCells[row][col] = isFixed;

                } catch (Exception e) {
                    System.out.println("Argumento inválido: " + arg);
                }
            }
        }

        // Cria o jogo e inicializa a interface
        SudokuGame game = new SudokuGame(initialBoard, fixedCells);
        new SudokuUI(game);
    }
}