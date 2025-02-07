public class ResponseTest {
    public static void main(String[] args) {
        lessOptimalApproach.Response lessOptimalResponse = new lessOptimalApproach.Response();
        int[] arr1 = {1, 2, 3, 3, 4, 5};
        int result1 = lessOptimalResponse.occurrences(arr1, 3);
        System.out.println(result1 == 2 ? "Less Optimal Test 1 Passed." : "Test 1 Failed: Expected 2, but got " + result1);

        int[] arr2 = {1, 2, 3, 3, 4, 5};
        int result2 = lessOptimalResponse.occurrences(arr2, 1);
        System.out.println(result2 == 1 ? "Less Optimal Test 2 Passed." : "Test 2 Failed: Expected 1, but got " + result2);

        int[] arr3 = {1, 2, 3, 3, 4, 5};
        int result3 = lessOptimalResponse.occurrences(arr3, 6);
        System.out.println(result3 == 0 ? "Less Optimal Test 3 Passed." : "Test 3 Failed: Expected 0, but got " + result3);

        int[] arr4 = {1, 2, 3, 3, 4, 5, 5, 5, 5};
        int result4 = lessOptimalResponse.occurrences(arr4, 5);
        System.out.println(result4 == 4 ? "Less Optimal Test 4 Passed." : "Test 4 Failed: Expected 4, but got " + result4);


        mostOptimalResponse.Response mostOptimalResponse = new mostOptimalResponse.Response();
        int result5 = mostOptimalResponse.occurrences(arr1, 3);
        System.out.println(result5 == 2 ? "Most Optimal Test 1 Passed." : "Test 1 Failed: Expected 2, but got " + result5);

        int result6 = mostOptimalResponse.occurrences(arr2, 1);
        System.out.println(result6 == 1 ? "Most Optimal Test 2 Passed." : "Test 2 Failed: Expected 1, but got " + result6);

        int result7 = mostOptimalResponse.occurrences(arr3, 6);
        System.out.println(result7 == 0 ? "Most Optimal Test 3 Passed." : "Test 3 Failed: Expected 0, but got " + result7);

        int result8 = mostOptimalResponse.occurrences(arr4, 5);
        System.out.println(result8 == 4 ? "Most Optimal Test 4 Passed." : "Test 4 Failed: Expected 4, but got " + result8);


        int[] arr5 = {1, 1, 1, 1, 1};
        int result9 = mostOptimalResponse.occurrences(arr5, 1);
        System.out.println(result9 == 5 ? "Most Optimal Test 5 Passed." : "Test 5 Failed: Expected 5, but got " + result9);

        int[] arr6 = {0, 0, 0, 0, 0};
        int result10 = mostOptimalResponse.occurrences(arr6, 0);
        System.out.println(result10 == 5 ? "Most Optimal Test 6 Passed." : "Test 6 Failed: Expected 5, but got " + result10);

        int[] arr7 = {10, 20, 30, 40, 50};
        int result11 = mostOptimalResponse.occurrences(arr7, 100);
        System.out.println(result11 == 0 ? "Most Optimal Test 7 Passed." : "Test 7 Failed: Expected 0, but got " + result11);
    }
}
