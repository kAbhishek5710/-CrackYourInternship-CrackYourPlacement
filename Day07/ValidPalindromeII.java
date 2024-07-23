public class ValidPalindromeII {
    public static void main(String[] args) {
        String s = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        System.out.println("Valid Palindrome : " + validPalindrome(s));
    }

    public static boolean validPalindrome(String s) {
        int canDelete = 1;
        return func(s, 0, s.length() - 1, canDelete);
    }

    public static boolean func(String s, int si, int ei, int canDelete) {
        while (si <= ei) {
            if (s.charAt(si) != s.charAt(ei)) {
                if (canDelete == 0) {
                    return false;
                }

                return func(s, si + 1, ei, canDelete - 1) || func(s, si, ei - 1, canDelete - 1);
            }
            si++;
            ei--;
        }
        return true;
    }
}
