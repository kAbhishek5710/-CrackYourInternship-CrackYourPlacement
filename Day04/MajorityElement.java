public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println("Majority Element : " + majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int el = -1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == el) {
                count++;
            } else {
                if (count >= 1) {
                    count--;
                } else {
                    el = nums[i];
                    count++;
                }
            }
        }
        return el;
    }
}
