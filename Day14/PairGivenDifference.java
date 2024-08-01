import java.util.HashMap;

public class PairGivenDifference {
    public static void main(String[] args) {
        int x = 78;
        int[] arr = { 5, 20, 3, 2, 5, 80 };

        boolean exist = findPair(arr, x);

        if (exist) {
            System.out.println("Pair does exist");
        } else {
            System.out.println("Does not exist");
        }
    }

    public static boolean findPair(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int el : arr) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            int toFind = arr[i] + target;
            if (toFind == arr[i] && map.get(arr[i]) <= 1) {
                continue;
            }
            if (map.containsKey(toFind)) {
                return true;
            }
            // map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        return false;
    }
}
