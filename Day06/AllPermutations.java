import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class AllPermutations {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 1));
        System.out.println(uniquePerms(arr, arr.size()));
    }

    public static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr, int n) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ls = new ArrayList<>();
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        boolean[] marked = new boolean[n];
        Collections.sort(arr);
        func(ls, ans, arr, marked, set, n);
        return ans;
    }

    public static void func(ArrayList<Integer> ls, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> arr,
            boolean[] marked, HashSet<ArrayList<Integer>> set, int n) {
        if (ls.size() == n) {
            if (!set.contains(ls)) {
                ans.add(new ArrayList<>(ls));
                set.add(new ArrayList<>(ls));
            }
            return;
        }
        for (int j = 0; j < n; j++) {
            if (!marked[j]) {
                marked[j] = true;
                ls.add(arr.get(j));
                func(ls, ans, arr, marked, set, n);
                marked[j] = false;
                ls.remove(ls.size() - 1);
            }
        }
    }
}
