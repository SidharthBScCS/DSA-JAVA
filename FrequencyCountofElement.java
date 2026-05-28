import java.util.HashMap;

public class FrequencyCountofElement {
    public static int freqCount(int[] arr, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        return hm.getOrDefault(target, 0);
    }
    public static void main(String[] args) {
        int[] arr = { 4, 4, 3, 2, 1 };
        int target = 4;
        int result = freqCount(arr, target);
        System.out.println(result);
    }
}
