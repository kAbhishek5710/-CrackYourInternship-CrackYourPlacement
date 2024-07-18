import java.util.HashMap;

public class SubarraysSumDivByK {

    static int ans = 0;

    public static void main(String[] args) {
        int[] arr = { 4, 5, 0, -2, -3, 1 };
        // int[] arr = { 5 };
        int k = 5;
        System.out.println("Total Subarrays that have sum divisivle by k :" + subarraysDivByK(arr, k));
    }

    public static int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int sum = 0;
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = ((sum % k) + k) % k;
            if (map.containsKey(rem)) {
                ans += map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return ans;
    }
}
