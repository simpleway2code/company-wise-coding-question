// Java code to find maximum triplet sum 
import java.io.*; 
import java.util.*; 


class solution { 
	
	// This function assumes that there 
	// are at least three elements in arr[]. 
	static int mTS(int arr[], int n) 
	{ 
		// Initialize Maximum, second maximum and third 
		// maximum element 
		int maxA = -100000000, maxB = -100000000; 
		int maxC = -100000000; 
	
		for (int i = 0; i < n; i++) { 
	
			// Update Maximum, second maximum 
			// and third maximum element 
			if (arr[i] > maxA) 
			{ 
				maxC = maxB; 
				maxB = maxA; 
				maxA = arr[i]; 
			} 
	
			// Update second maximum and third maximum 
			// element 
			else if (arr[i] > maxB) 
			{ 
				maxC = maxB; 
				maxB = arr[i]; 
			} 
	
			// Update third maximum element 
			else if (arr[i] > maxC) 
				maxC = arr[i]; 
		} 
	
		return (maxA + maxB + maxC); 
	} 

    //Main Code
	public static void main(String args[]) 
	{ 
		int arr[] = { 1, 0, 8, 6, 4, 2 }; 
		int n = arr.length; 
		System.out.println(mTS(arr, n)); 
	} 
} 

