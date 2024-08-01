public class RabinKarp {
    public static void main(String[] args) {
        String str = "AABAACAADAABAABA";
        String pattern = "AABA";
        rabinKarp(str, pattern);
    }

    public static void rabinKarp(String str, String pattern) {
        int ei = pattern.length();
        int si = 0;
        while (ei <= str.length()) {
            if (str.substring(si, ei).equals(pattern)) {
                System.out.println("Pattern appeared at index : " + si);
            }
            si++;
            ei++;
        }
    }
}
