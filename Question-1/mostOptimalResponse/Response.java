package mostOptimalResponse;

public class Response {

    public static int occurrences(int[] arr, int target) {
        int firstIndex = binarySearch(arr, target, true);
        int lastIndex = binarySearch(arr, target, false);

        if (firstIndex == -1) {
            return 0;
        }

        return lastIndex - firstIndex + 1;
    }

    private static int binarySearch(int[] arr, int target, boolean findFirst) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                if (findFirst) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5};
        int target = 3;
        int result = occurrences(arr, target);
        System.out.println("The number " + target + " appears " + result + " times.");
    }
}
