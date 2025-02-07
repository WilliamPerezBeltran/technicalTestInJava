public class Response {

    public static int climb(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        int prev2 = 1, prev1 = 2;
        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(climb(n));
    }
}
