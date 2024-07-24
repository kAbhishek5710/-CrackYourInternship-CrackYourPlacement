public class IntegerToRoman {
    public static void main(String[] args) {
        int n = 3749;
        System.out.println("Roman : " + intToRoman(n));
    }

    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            if (num / 1000 >= 1) {
                sb.append('M');
                num -= 1000;
            } else if (num / 900 >= 1) {
                sb.append("CM");
                num -= 900;
            } else if (num / 500 >= 1) {
                sb.append('D');
                num -= 500;
            } else if (num / 400 >= 1) {
                sb.append("CD");
                num -= 400;
            } else if (num / 100 >= 1) {
                sb.append('C');
                num -= 100;
            } else if (num / 90 >= 1) {
                sb.append("XC");
                num -= 90;
            } else if (num / 50 >= 1) {
                sb.append('L');
                num -= 50;
            } else if (num / 40 >= 1) {
                sb.append("XL");
                num -= 40;
            } else if (num / 10 >= 1) {
                sb.append('X');
                num -= 10;
            } else if (num / 9 >= 1) {
                sb.append("IX");
                num -= 9;
            } else if (num / 5 >= 1) {
                sb.append('V');
                num -= 5;
            } else if (num / 4 >= 1) {
                sb.append("IV");
                num -= 4;
            } else {
                sb.append('I');
                num -= 1;
            }
        }
        return sb.toString();
    }
}
