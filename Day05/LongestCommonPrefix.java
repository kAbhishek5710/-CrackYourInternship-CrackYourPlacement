public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        System.out.println("Longest Common Prefix : " + longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        for (int i = 1; i < strs.length; i++) {
            ans = commonPrefix(ans, strs[i]);
        }

        return ans;
    }

    public static String commonPrefix(String str1, String str2) {
        int i = 0;
        while (i < str1.length() && i < str2.length()) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.substring(0, i);
            }
            i++;
        }
        return str1.substring(0, i);
    }
}
