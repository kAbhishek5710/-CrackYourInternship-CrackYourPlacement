import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 0, 0, 0 };
        int[] arr2 = { 2, 5, 6 };
        merge(arr1, 3, arr2, 3);
        System.out.println("Sorted Array : " + Arrays.toString(arr1));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int e1 = m - 1;
        int e2 = n - 1;
        int e = m + n - 1;

        while (e1 >= 0 && e2 >= 0) {
            if (nums1[e1] >= nums2[e2]) {
                nums1[e--] = nums1[e1--];
            } else {
                nums1[e--] = nums2[e2--];
            }
        }
        while (e2 >= 0) {
            nums1[e--] = nums2[e2--];
        }
    }
}
