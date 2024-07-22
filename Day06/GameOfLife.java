public class GameOfLife {
    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 0 }, { 0, 0, 1 }, { 1, 1, 1 }, { 0, 0, 0 } };
        gameOfLife(arr);
    }

    public static void gameOfLife(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        int[][] directions = {
                { -1, -1 }, { -1, 0 }, { -1, 1 },
                { 0, -1 }, { 0, 1 },
                { 1, -1 }, { 1, 0 }, { 1, 1 }
        };
        int[][] copy = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                copy[i][j] = board[i][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int liveNeighbors = 0;

                for (int[] direction : directions) {
                    int r = i + direction[0];
                    int c = j + direction[1];

                    if (r >= 0 && r < rows && c >= 0 && c < cols && copy[r][c] == 1) {
                        liveNeighbors++;
                    }
                }

                if (copy[i][j] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[i][j] = 0;
                } else if (copy[i][j] == 0 && liveNeighbors == 3) {
                    board[i][j] = 1;
                }
            }
        }
    }
}
