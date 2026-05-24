import java.util.HashMap;

public class FrequencyArray {
    public static void arrayFreq(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for (int key : hm.keySet()) {
            System.out.println(key + ":" + hm.get(key));
        }
    }
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 10, 2 };
        arrayFreq(arr);
    }
}
