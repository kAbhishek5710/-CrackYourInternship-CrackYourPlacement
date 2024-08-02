public class FirstMissingPosititve {
    public static void main(String[] args) {
        int[] nums = { 0, -10, 1, 3, -20 };
        System.out.println("First Missing Positive NUmber : " + missingNumber(nums, nums.length));
    }

    public static int missingNumber(int arr[], int size) {
        // Your code here
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0 || arr[i] > size) {
                arr[i] = size + 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int num = Math.abs(arr[i]);
            if (Math.abs(arr[i]) > size) {
                continue;
            }
            if (arr[num - 1] > 0) {
                arr[num - 1] = -arr[num - 1];
            }
        }

        for (int i = 0; i < size; i++) {
            if (arr[i] > 0) {
                return i + 1;
            }
        }

        return size + 1;

    }
}
