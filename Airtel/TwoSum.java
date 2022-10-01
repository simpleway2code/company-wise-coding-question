// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Output: Because nums[0] + nums[1] == 9, we return [0, 1].


import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of Array: ");
		int size = Integer.parseInt(sc.nextLine());

		System.out.println("Enter Array elements seperated by space \" \"");
		String arrElements = sc.nextLine();

		String[] strArr = arrElements.trim().split(" ");
		int[] arr = new int[size];

		// taking input for array
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		
		System.out.println("Enter Target: ");
		int target = sc.nextInt();
		int[] res = twoSum(arr, target);
		if (res.length == 2)
			System.out.println("index: "+res[0] + " & index: " + res[1]);
		else
			System.out.println("Not Found");
	}

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> newMap = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
			if (newMap.containsKey(diff)) {
				return new int[] { newMap.get(diff), i };
			}
			newMap.put(nums[i], i);
		}

		return new int[0];
	}
}
