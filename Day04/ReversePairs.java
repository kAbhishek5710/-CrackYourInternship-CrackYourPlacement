public class ReversePairs {
    public static void main(String[] args) {
        long[] arr = { 2, 4, 1, 3, 5 };
        int n = arr.length;
        System.out.println("Inverse Pairs : " + inversionCount(arr, n));
    }

    static long inversionCount(long arr[], int n) {
        // Your Code Here
        return mergeSort(0, n - 1, arr);
    }

    static long mergeSort(int si, int ei, long[] arr) {
        long count = 0;
        if (si < ei) {
            int mid = si + (ei - si) / 2;
            count += mergeSort(si, mid, arr);
            count += mergeSort(mid + 1, ei, arr);
            count += merge(si, mid, ei, arr);
        }
        return count;
    }

    static long merge(int si, int mid, int ei, long[] arr) {
        long[] temp = new long[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        long count = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i + 1);
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
