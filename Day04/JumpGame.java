public class JumpGame {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 0, 4 };
        System.out.println("Can Jump : " + canJump(arr));
    }

    public static boolean canJump(int[] nums) {
        int maxIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            maxIdx = Math.max(maxIdx, i + nums[i]);
            if (nums[i] == 0 && maxIdx <= i) {
                if (i == nums.length - 1) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }
}
