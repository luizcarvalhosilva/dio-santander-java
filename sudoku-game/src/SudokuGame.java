public class SudokuGame {
    private int[][] board;
    private boolean[][] fixed; // marca os números fixos do jogo

    // Construtor padrão usando inicialBoard e calculando fixed automaticamente
    public SudokuGame(int[][] initialBoard) {
        board = new int[9][9];
        fixed = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = initialBoard[i][j];
                fixed[i][j] = initialBoard[i][j] != 0;
            }
        }
    }

    // Novo construtor para aceitar explicitamente números fixos
    public SudokuGame(int[][] board, boolean[][] fixed) {
        this.board = new int[9][9];
        this.fixed = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                this.board[i][j] = board[i][j];
                this.fixed[i][j] = fixed[i][j];
            }
        }
    }

    public boolean setNumber(int row, int col, int num) {
        if (fixed[row][col] || board[row][col] != 0) return false;
        if (num < 1 || num > 9) return false;
        board[row][col] = num;
        return true;
    }

    public boolean removeNumber(int row, int col) {
        if (fixed[row][col]) return false;
        board[row][col] = 0;
        return true;
    }

    public int getNumber(int row, int col) {
        return board[row][col];
    }

    public boolean isFixed(int row, int col) {
        return fixed[row][col];
    }

    public boolean isComplete() {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (board[i][j] == 0 || !isValidPosition(i, j)) return false;
        return true;
    }

    public boolean hasErrors() {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (board[i][j] != 0 && !isValidPosition(i, j)) return true;
        return false;
    }

    private boolean isValidPosition(int row, int col) {
        int num = board[row][col];
        if (num == 0) return true;

        // verifica linha e coluna
        for (int i = 0; i < 9; i++) {
            if (i != col && board[row][i] == num) return false;
            if (i != row && board[i][col] == num) return false;
        }

        // verifica bloco 3x3
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++)
            for (int j = startCol; j < startCol + 3; j++)
                if ((i != row || j != col) && board[i][j] == num) return false;

        return true;
    }

    public void clearUserNumbers() {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (!fixed[i][j]) board[i][j] = 0;
    }

    public int[][] getBoard() {
        return board;
    }
}
