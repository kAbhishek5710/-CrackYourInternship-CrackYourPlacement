import java.util.Arrays;

public class SetZeroes {
    public static void main(String[] args) {
        int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        setZeroes(matrix);
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void setZeroes(int[][] matrix) {
        int col0 = 1;
        int r = matrix.length - 1;
        int c = matrix[0].length - 1;

        // Mark the first row and column as zero if any of the element in that given row
        // or column is zero
        // Because the first cell will be counted twice so iinsted we'll take seperate
        // cell for col as col0
        for (int i = 0; i <= r; i++) {
            for (int j = 0; j <= c; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }

        // Now mark the elements as zero except first row and column based on values of
        // first row and column
        for (int i = r; i > 0; i--) {
            for (int j = c; j > 0; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Now mark the first row based on first cell
        if (matrix[0][0] == 0) {
            for (int i = 1; i <= c; i++) {
                matrix[0][i] = 0;
            }
        }

        // Now mark the first row based on col0
        if (col0 == 0) {
            for (int i = 0; i <= r; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
