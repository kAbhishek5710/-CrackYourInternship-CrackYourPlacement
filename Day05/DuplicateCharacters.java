import java.util.ArrayList;
import java.util.HashMap;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(duplicateCharacters(s));
    }

    public static HashMap<Character, Integer> duplicateCharacters(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        ArrayList<Character> ls = new ArrayList<>();

        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                ls.add(ch);
            }
        }

        for (char ch : ls) {
            map.remove(ch);
        }

        return map;
    }
}
