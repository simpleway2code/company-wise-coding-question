public class KthElementInTwoSortedArray {
    

	/*
	 * Given two sorted arrays of size m and n respectively, you are tasked with
	 * finding the element that would be at the kth position of the final sorted
	 * array.
	 * 
	 * Input: m = 5 n = 4
	 * 
	 * array1 = [2,3,6,7,9] array2 = [1,4,8,10]
	 * 
	 * k = 5
	 * 
	 * Output: 6
	 * 
	 */

	public static void main(String args[]) {

		int[] arr1 = { 2, 3, 6, 7, 9 };
		int[] arr2 = { 1, 4, 8, 10 };
		System.out.println(findKthElement(arr1, arr2, arr1.length, arr2.length, 5));
	}

	public static int findKthElement(int[] arr1, int[] arr2, int len1, int len2, int k) {

		if (len1 > len2) {
			return findKthElement(arr2, arr1, len2, len1, k);
		}

		int low = Math.max(0, k - len1), high = Math.min(k, len2);

		while (low <= high) {
			int cut1 = low + (high - low) / 2;
			int cut2 = k - cut1;

			int l1 = cut1 == 0 ? Integer.MIN_VALUE : arr1[cut1 - 1];
			int l2 = cut2 == 0 ? Integer.MIN_VALUE : arr2[cut1 - 1];
			int r1 = cut1 == len1 ? Integer.MAX_VALUE : arr1[cut1];
			int r2 = cut2 == len2 ? Integer.MAX_VALUE : arr2[cut2];

			if (l1 <= r1 && l2 <= r2) {
				return Math.max(l1, l2);
			} else if (l1 > r2) {
				high = cut1 - 1;
			} else {
				low = cut1 + 1;
			}
		}

		return 1;
	}


    
}
