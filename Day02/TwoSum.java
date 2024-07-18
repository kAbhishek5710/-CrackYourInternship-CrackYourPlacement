import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                return new int[] { map.get(target - arr[i]), i };
            } else {
                map.put(arr[i], i);
            }
        }

        // --------> Brute Force <------------

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[i] + arr[j] == target) {
        // return new int[] { i, j };
        // }
        // }
        // }

        return new int[] {};
    }
}
