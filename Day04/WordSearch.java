public class WordSearch {
    public static void main(String[] args) {
        char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        String word = "ABCCED";
        System.out.println("Word Exists : " + exist(board, word));
    }

    public static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (checkExist(0, i, j, board, word)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean checkExist(int idx, int row, int col, char[][] board, String word) {
        if (idx == word.length()) {
            return true;
        }
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length
                || board[row][col] != word.charAt(idx)) {
            return false;
        }
        if (board[row][col] == word.charAt(idx)) {
            char temp = board[row][col];
            board[row][col] = '-';
            boolean left = checkExist(idx + 1, row, col - 1, board, word);
            boolean right = checkExist(idx + 1, row, col + 1, board, word);
            boolean up = checkExist(idx + 1, row - 1, col, board, word);
            boolean down = checkExist(idx + 1, row + 1, col, board, word);

            board[row][col] = temp;
            return (left || right || up || down);
        }

        return false;
    }
}
