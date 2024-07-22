import java.util.Deque;
import java.util.LinkedList;

public class MaxValueEquation {
    public static void main(String[] args) {
        int[][] points = { { -19, -12 }, { -13, -18 }, { -12, 18 }, { -11, -8 }, { -8, 2 }, { -7, 12 }, { -5, 16 },
                { -3, 9 }, { 1, -7 }, { 5, -4 }, { 6, -20 }, { 10, 4 }, { 16, 4 }, { 19, -9 }, { 20, 19 } };
        System.out.println(findMaxValueOfEquation(points, 6));
    }

    public static int findMaxValueOfEquation(int[][] points, int k) {
        int max = Integer.MIN_VALUE;

        Deque<int[]> deque = new LinkedList<>();

        for (int[] point : points) {
            int x = point[0];
            int y = point[1];

            while (!deque.isEmpty() && x - deque.peekFirst()[0] > k) {
                deque.pollFirst();
            }

            if (!deque.isEmpty()) {
                max = Math.max(max, y + x + deque.peekFirst()[1] - deque.peekFirst()[0]);
            }

            while (!deque.isEmpty() && y - x >= deque.peekLast()[1] - deque.peekLast()[0]) {
                deque.pollLast();
            }

            deque.offerLast(new int[] { x, y });
        }

        return max;
    }
}
