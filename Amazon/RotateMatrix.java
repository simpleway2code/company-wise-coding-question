import java.util.Arrays;

public class RotateMatrix {
    

	/*
	 * You are given an n x n 2D matrix representing an image, rotate the image by
	 * 90 degrees (clockwise).
	 * 
	 * You have to rotate the image in-place, which means you have to modify the
	 * input 2D matrix directly. DO NOT allocate another 2D matrix and do the
	 * rotation.
	 * 
	 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
	 * 
	 * Output: [[7,4,1],[8,5,2],[9,6,3]]
	 */

	public static void main(String[] args) {

		int arr[][] = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };

		int arr2[][] = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };

		rotateMatrix_bruteforce(arr);

		System.out.println("The Final Matrix is ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

		rotateMatrix_better_approach(arr2);

		System.out.println("The Final Matrix is ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}
	}

	private static void rotateMatrix_bruteforce(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < (n + 1) / 2; i++) {
			for (int j = 0; j < n / 2; j++) {
				int temp = matrix[n - 1 - j][i];
				matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
				matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 - i];
				matrix[j][n - 1 - i] = matrix[i][j];
				matrix[i][j] = temp;
			}
		}
	}

	/*
	 * Approach:
	 * 
	 * Step1: Transpose of the matrix. (transposing means changing columns to rows
	 * and rows to columns)
	 * 
	 * Step2: Reverse each row of the matrix.
	 */

	private static void rotateMatrix_better_approach(int[][] matrix) {

		// Transpose
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix[0].length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		// Reverse each row
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length - 1 - j];
				matrix[i][matrix.length - 1 - j] = temp;
			}
		}

	}

}
