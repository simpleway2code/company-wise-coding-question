public class CountNumberOfRotation {
    
	/*
	 * Given an ascending sorted rotated array Arr of distinct integers of size N.
	 * The array is right rotated K times. Find the value of K.
	 * 
	 * Example 1: Input: N = 5 Arr[] = {5, 1, 2, 3, 4} Output: 1
	 * 
	 * Input: N = 5 Arr[] = {1, 2, 3, 4, 5} Output: 0
	 * 
	 */

	public static void main(String args[]) {

		int[] arr = { 5, 1, 2, 3, 4 };
		System.out.println(findRotationCount(arr, arr.length));
	}

	public static int findRotationCount(int[] arr, int n) {

		int increasingCount = 1;
		for (int i = 1; i < n; i++) {
			if (arr[i - 1] > arr[i]) {
				break;
			} else {
				increasingCount++;
			}
		}
		if (increasingCount == n) {
			return 0;
		} else {
			return increasingCount;
		}
	}


}
