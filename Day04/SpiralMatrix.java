import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Spiral Order : " + spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int sRow = 0;
        int sCol = 0;
        int lRow = matrix.length - 1;
        int lCol = matrix[0].length - 1;

        while (sRow <= lRow && sCol <= lCol) {
            for (int i = sCol; i <= lCol; i++) {
                ans.add(matrix[sRow][i]);
            }
            for (int i = sRow + 1; i <= lRow; i++) {
                ans.add(matrix[i][lCol]);
            }
            for (int i = lCol - 1; i >= sCol; i--) {
                if (sRow == lRow) {
                    continue;
                }
                ans.add(matrix[lRow][i]);
            }

            for (int i = lRow - 1; i > sRow; i--) {
                if (sCol == lCol) {
                    continue;
                }
                ans.add(matrix[i][sRow]);
            }

            sRow++;
            sCol++;
            lRow--;
            lCol--;
        }

        return ans;
    }
}
