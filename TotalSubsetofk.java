public class TotalSubsetofk {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int totalSubset(int[] arr, int k) {
        int n = arr.length;
        int total = factorial(n) / factorial(k) * factorial(n - k);
        return total;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2 };
        int k = 2;
        int result = totalSubset(arr, k);
        System.out.println(result);
    }
    
}
