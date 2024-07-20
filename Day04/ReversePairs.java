public class ReversePairs {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 5, 1 };
        System.out.println("Reverse Pairs : " + reversePairs(arr));
    }

    public static int reversePairs(int[] nums) {
        return mergeSort(0, nums.length - 1, nums);
    }

    public static int mergeSort(int si, int ei, int[] arr) {
        int count = 0;
        if (si < ei) {
            int mid = si + (ei - si) / 2;
            count += mergeSort(si, mid, arr);
            count += mergeSort(mid + 1, ei, arr);
            count += merge(si, mid, ei, arr);
        }
        return count;
    }

    public static int merge(int si, int mid, int ei, int[] arr) {
        int[] temp = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        int count = 0;
        for (int left = si; left <= mid; left++) {
            while (j <= ei && arr[left] > 2L * arr[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }
        j = mid + 1;
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (int l = si, m = 0; m < temp.length; l++, m++) {
            arr[l] = temp[m];
        }

        return count;
    }
}
