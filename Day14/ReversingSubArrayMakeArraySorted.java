public class ReversingSubArrayMakeArraySorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 4, 3, 0 };
        System.out.println("Can it be sorted : " + checkReverse(arr));
    }

    public static boolean checkReverse(int[] arr) {
        int x = -1;
        int y = arr.length - 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                if (x == -1) {
                    x = i;
                }
                y = i + 1;
            }
        }
        if (x != -1) {
            reverseArray(arr, x, y);
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void reverseArray(int[] arr, int si, int ei) {
        while (si <= ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }

    // public static boolean checkReverse(int[] arr) {
    // int[] temp = new int[arr.length];
    // int i = 0;
    // for (int el : arr) {
    // temp[i++] = el;
    // }
    // Arrays.sort(temp);
    // for (i = 0; i < arr.length; i++) {
    // if (arr[i] != temp[i]) {
    // while (i + 1 < arr.length) {
    // if (arr[i + 1] > arr[i]) {
    // return false;
    // }
    // i++;
    // }
    // }
    // }
    // return true;
    // }
}
