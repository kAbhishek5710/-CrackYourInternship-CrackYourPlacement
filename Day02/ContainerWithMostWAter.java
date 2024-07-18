public class ContainerWithMostWAter {
    public static void main(String[] args) {
        int[] heights = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println("Max amount of water : " + maxArea(heights));
    }

    public static int maxArea(int[] height) {
        int n = height.length;
        int maxWater = 0;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int ht = Math.min(height[left], height[right]);
            int width = right - left;
            maxWater = Math.max(maxWater, ht * width);
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}
