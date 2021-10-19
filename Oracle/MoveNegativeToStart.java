public class MoveNegativeToStart {
	public static void main(String[] args) {

		// INPUT-OUTPUT Format
		/*
		 * Enter Size of Array: 
		 * 10 
		 * Enter Array elements seperated by space " " 
		 * -4 -5 10 3 -1 4 -5 10 3 -1 
		 * Output Array: 
		 * -4 -5 -1 -5 -1 4 3 10 3 10
		 */

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
		
		// arrangeArrMethod1(arr);    // Solution 1
		arrangeArrMethod2(arr);       // Solution 2
		
		printArray(arr);
	}

	static void printArray(int[] arr) {

		System.out.println("Output Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	static void arrangeArrMethod1(int[] arr) {

		int temp=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < 0)
				continue;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] > 0)
					continue;
				else {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					break;
				}
			}
		}
	}
	
	static void arrangeArrMethod2(int[] arr) {
		
		int j = 0, temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < 0) {			
				if(i != j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}				
				j++;
			}
		}

	}

}
