import java.util.*;

public class PermuteArrays {
    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(2, 1, 3);
        List<Integer> arr2 = Arrays.asList(7, 8, 9);
        int k = 10;

        System.out.println("Permute Arrays : " + permute(arr1, arr2, k));
    }

    public static boolean permute(List<Integer> arr1, List<Integer> arr2, int k) {
        if (arr1.size() != arr2.size()) {
            return false;
        }
        Collections.sort(arr1);
        Collections.sort(arr2, Collections.reverseOrder());

        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) + arr2.get(i) < k) {
                return false;
            }
        }

        return true;
    }
}