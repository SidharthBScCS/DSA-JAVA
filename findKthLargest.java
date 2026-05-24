import java.util.PriorityQueue;

public class findKthLargest {
    public static int largest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : arr) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 6, 7 };
        int k = 2;
        int ans = largest(arr, k);
        System.out.println(ans);
    }
}