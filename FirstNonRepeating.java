import java.util.HashMap;

public class FirstNonRepeating {
    public static char firstOneRepeat(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }

        for (char ch : str.toCharArray()) {
            if (hm.get(ch) == 1) {
                return ch;
            }
        }
        return '#';
    }
    
    public static void main(String[] args) {
        String str = "Programming";
        Character result = firstOneRepeat(str);
        System.out.println(result);
    }
}
