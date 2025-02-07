public class ResponseTest {

    public static void main(String[] args) {
        test(0, 1);
        test(1, 1);
        test(2, 2);
        test(3, 3);
        test(4, 5);
        test(5, 8);
        test(10, 89);
    }

    private static void test(int n, int expected) {
        int result = Response.climb(n);
        System.out.println("waysToClimb(" + n + ") = " + result + " | Expected: " + expected 
                           + " | " + (result == expected ? "PASS" : "FAIL"));
    }
}
