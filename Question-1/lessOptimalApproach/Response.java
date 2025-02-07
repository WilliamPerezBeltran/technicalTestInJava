public class Response{
	
	public static int occurrences(int[] arr, int number) {
	    int count = 0;
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == number) {
	            count++;
	        }
	    }
	    return count;
	}
	
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 3, 4, 5,5,5,5,5};
		int number = 5;
		System.out.println(occurrences(arr,number));
	}
}
