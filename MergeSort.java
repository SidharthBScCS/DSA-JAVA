import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSorting(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int mid = (arr.length) / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        mergeSorting(left);
        mergeSorting(right);

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i = i + 1;
            } else {
                arr[k] = right[j];
                j = j + 1;
            }
            k = k + 1;
        }

        while (i < left.length) {
            arr[k] = left[i];
            k = k + 1;
            i = i + 1;
        }

        while (j < right.length) {
            arr[k] = right[j];
            j = j + 1;
            i = i + 1;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 2, 1 };
        int[] sortedArr = mergeSorting(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
}