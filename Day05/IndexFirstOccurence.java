public class IndexFirstOccurence {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println("First Occurence : " + strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        int len = needle.length();

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if ((i + len) <= haystack.length() && haystack.substring(i, i + len).equals(needle)) {
                    return i;
                }
            }
        }

        return -1;
    }
}
