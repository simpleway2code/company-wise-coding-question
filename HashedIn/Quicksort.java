package HashedIn;

public class Quicksort {

	public static void main(String args[]) {

		int[] arr = { 13, 46, 24, 52, 20, 9 };

		quicksort(arr);

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static int[] quicksort(int[] arr) {
		quicksort(arr, 0, arr.length - 1);

		return arr;
	}

	// Helper function to recursively perform quicksort
	// quicksort will be called recursively for the elemnts to the left of pivot
	// And the elements to the right of pivot
	private static void quicksort(int[] arr, int left, int right) {

		// Only proceed if left is less than right
		if (left < right) {
			// Find the position of pivot
			int pivotFinalRestingPosition = partition(arr, left, right);

			// Recursively call left and right subarray to the pivot
			quicksort(arr, left, pivotFinalRestingPosition - 1);
			quicksort(arr, pivotFinalRestingPosition + 1, right);
		}
	}

	/*
	 * The partition function that chooses a pivot, partitions the array around the
	 * pivot, places the pivot value where it belongs, and then returns the index of
	 * where the pivot finally lies
	 */
	private static int partition(int[] arr, int left, int right) {
		int pivot = arr[right];

		/*
		 * i will keep track of the "tail" of the section of items less than the pivot
		 * so that at the end we can "sandwich" the pivot between the section less than
		 * it and the section greater than it
		 */
		int i = left - 1;

		for (int j = left; j < right; j++) {
			if (arr[j] <= pivot) {
				i++;

				swap(arr, i, j);
			}
		}

		swap(arr, i + 1, right);

		return i + 1; // Return the pivot's final resting position
	}

	// Helper function to swap elements at 2 different array indices
	private static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
