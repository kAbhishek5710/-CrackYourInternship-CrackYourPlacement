import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        System.out.println("Triplets with sum = 0 : " + threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        int mid;
        int high;

        for (int i = 0; i < nums.length; i++) {
            mid = i + 1;
            high = nums.length - 1;
            while (mid < high) {
                int sum = nums[i] + nums[mid] + nums[high];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[mid], nums[high]));
                    mid++;
                    high--;
                    while (mid < nums.length && nums[mid] == nums[mid - 1])
                        mid++;
                    while (high >= 0 && nums[high] == nums[high + 1])
                        high--;
                } else if (sum < 0) {
                    mid++;
                } else {
                    high--;
                }
            }
            while (i + 1 < nums.length && nums[i + 1] == nums[i]) {
                i++;
            }
        }

        // ----------> Better Approach <----------

        // for (int i = 0; i < nums.length - 1; i++) {
        // HashSet<Integer> set = new HashSet<>();
        // set.add(nums[i + 1]);
        // for (int j = i + 2; j < nums.length; j++) {
        // int sum = nums[i] + nums[j];
        // if (set.contains(0 - sum)) {
        // List<Integer> ls = new ArrayList<>(Arrays.asList(nums[i], nums[j], -1 *
        // sum));
        // Collections.sort(ls);
        // if (!ans.contains(ls)) {
        // ans.add(ls);
        // }
        // }
        // set.add(nums[j]);
        // }
        // }

        // -------------> Brute Force <----------------

        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // for (int k = j + 1; k < nums.length; k++) {
        // int sum = nums[i] + nums[j] + nums[k];
        // if (sum == 0) {
        // List<Integer> ls = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
        // Collections.sort(ls);
        // if (!ans.contains(ls)) {
        // ans.add(ls);
        // }
        // }
        // }
        // }
        // }
        return ans;
    }
}
