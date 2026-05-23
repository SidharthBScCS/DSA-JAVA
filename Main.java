import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    public static int[] heapSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : arr) {
            pq.add(num);
        }
        int i = 0;
        while (!pq.isEmpty()) {
            arr[i++] = pq.poll();
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[] { 4, 3, 2, 1 };
        int[] sortedArray = heapSort(arr);
        System.out.println(Arrays.toString(sortedArray));
    }
}