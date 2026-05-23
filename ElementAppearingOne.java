public class ElementAppearingOne {
    public static int findSingle(int[] arr) {
        int ans = 0;
        for (int num : arr) {
            ans = ans ^ num;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 2, 3, 3, 4, 4, 5, 5 };
        System.out.println(findSingle(arr));
    }
}
