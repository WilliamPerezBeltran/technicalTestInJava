public class ResponseTest {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 3, 4, 5};
        int result1 = Response.occurrences(arr1, 3);
        System.out.println(result1 == 2 ? "Test 1 passed." : "Test 1 failed: Expected 2, but got " + result1);

        int[] arr2 = {1, 2, 3, 3, 4, 5};
        int result2 = Response.occurrences(arr2, 1);
        System.out.println(result2 == 1 ? "Test 2 passed." : "Test 2 failed: Expected 1, but got " + result2);

        int[] arr3 = {1, 2, 3, 3, 4, 5};
        int result3 = Response.occurrences(arr3, 6);
        System.out.println(result3 == 0 ? "Test 3 passed." : "Test 3 failed: Expected 0, but got " + result3);

        int[] arr4 = {1, 2, 3, 3, 4, 5, 5, 5, 5};
        int result4 = Response.occurrences(arr4, 5);
        System.out.println(result4 == 4 ? "Test 4 passed." : "Test 3 failed: Expected 0, but got " + result4);
    }
}
