import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = { 10, 2, 5, 10, 9, 1, 1, 4, 3, 7 };
        System.out.println("Duplicates : " + findDuplicates(arr));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int el : nums) {
            int idx = Math.abs(el) - 1;
            if (nums[idx] < 0) {
                ans.add(idx + 1);
            }
            nums[idx] *= -1;
        }
        for (int el : nums) {
            int idx = Math.abs(el) - 1;
            nums[idx] *= -1;
        }
        return ans;
    }
}
