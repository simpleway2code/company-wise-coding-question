import java.util.Scanner;

public class MoveZeroToEnd {
	
	
	// INPUT-OUTPUT Format
	/*
	 *  Enter Size of Array: 
	 *	5
	 *	Enter Array elements seperated by space " "
 	 *	0 3 4 0 4
	 *	Output Array: 
	 *	3 4 4 0 0 
	 */
    
    public static void moveZeroes(int[] nums) {
        
        int zeroPos = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] != 0){
                nums[zeroPos++] = nums[i];
            } 
        }
        while(zeroPos < nums.length){
            nums[zeroPos++] = 0;
        }
    }

    public static void main(String[] args) {

		// Taking inputs
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

		moveZeroes(arr); 
		
		printArray(arr);
	}

	static void printArray(int[] arr) {

		System.out.println("Output Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
}