public class CeilingInArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 10, 10, 12, 19 };
        int x = 3;
        System.out.println("ceiling of " + x + " is " + ceilSearch(arr, x));

    }

    public static int ceilSearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return arr[low];
    }
}
