public class MaximumPointsCards {
    public static void main(String[] args) {
        int[] cardPoints = { 1, 2, 3, 4, 5, 6, 1 };
        int k = 3;
        System.out.println("Maximum Points : " + maxScore(cardPoints, k));
    }

    public static int maxScore(int[] cardPoints, int k) {
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < k; i++) {
            leftSum += cardPoints[i];
        }
        int max = leftSum;
        int j = k - 1;
        for (int i = cardPoints.length - 1; i >= cardPoints.length - k; i--) {
            rightSum += cardPoints[i];
            leftSum -= cardPoints[j--];

            max = Math.max(leftSum + rightSum, max);
        }
        return max;
    }
}
