import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroes(int[] arr) {
        int left = 0;
        int right = 0;
        while (right < arr.length) {
            if (arr[right] != 0) {
                swap(arr, left, right);
                left++;
            }
            right++;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
