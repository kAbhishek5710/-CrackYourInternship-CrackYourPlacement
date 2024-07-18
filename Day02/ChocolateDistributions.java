import java.util.Arrays;

public class ChocolateDistributions {
    public static void main(String[] args) {
        int[] chocolates = { 3, 4, 1, 9, 56, 7, 9, 12 };
        int students = 5;
        System.out.println("Minimum Difference : " + findMinDiff(chocolates, chocolates.length, students));
    }

    public static long findMinDiff(int[] a, int n, int m) {
        // your code here
        Arrays.sort(a);
        long minDif = Integer.MAX_VALUE;
        for (int i = m - 1; i < n; i++) {
            minDif = Math.min(a[i] - a[i - m + 1], minDif);
        }

        return minDif;
    }
}
