import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = { 1000000000, 1000000000, 1000000000, 1000000000 };
        int target = -294967296;
        System.out.println("4 Sum : " + fourSum(arr, target));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int k = j + 1;
                int l = nums.length - 1;

                while (k < l) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                    if (sum == target) {
                        ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k], nums[l])));
                        k++;
                        l--;
                        while (k < nums.length && nums[k] == nums[k - 1])
                            k++;
                        while (l >= 0 && nums[l] == nums[l + 1])
                            l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }

                while (j + 1 < nums.length && nums[j + 1] == nums[j]) {
                    j++;
                }
            }
            while (i + 1 < nums.length && nums[i + 1] == nums[i]) {
                i++;
            }
        }

        return ans;
    }
}
