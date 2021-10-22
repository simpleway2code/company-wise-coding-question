import  java.util.Scanner;
/**
 * Write an efficient program to find the sum of contiguous subarray 
 * within a one-dimensional array of numbers that has the largest sum. 
 *
 * Input : arr[] = {-2, -3, 4, -1, -2, 1, 5, -3}
 * Output : 7
 * 
 * Explaination : Subarray {4, -1, -2, 1, 5} has the maximum sum 
 */

public class maximumSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i =0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        // Kadanes Algorithm
        int maxSum = Integer.MIN_VALUE, currSum = 0;
        for(int i = 0; i <n; i++) {
            currSum = currSum + ar[i];
            if(maxSum < currSum)
                maxSum = currSum;
            if(currSum < 0)
                currSum = 0;
        }
        System.out.println(maxSum);
    }
}
