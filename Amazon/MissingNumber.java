import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Find the missing number in the array
*  Tag - Amazon
*/

public class MissingNumber {
	public static void main(String args[]) throws IOException{

			
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			int count = Integer.parseInt(input.readLine());
			
			String ch[] = input.readLine().split(" ");
			int[] ar = new int[count-1];
				
			for(int i = 0; i < count - 1; i++) {
				int integer = Integer.parseInt(ch[i]);
				ar[i] = integer; 
			}
			
			int missing = findMissingNumber(ar);				
			System.out.println(missing);
		
		}
		static int findMissingNumber(int array[]){

		int   sumOfElements = 0;        //Sum of given Array Elements
		int   totalActualSum = 0;       //to store the total sum of 'n'  numbers
		int   n = array.length+1;       //might change depending on language
		int   missingNumber = 0;        //to store the missing number 

		totalActualSum = n * ( n + 1) / 2 ;
		
		for ( Integer  i  :  array) {         
			sumOfElements +=  i;        // get the sum of array elements  
		}       
		missingNumber = totalActualSum - sumOfElements ;
		return  missingNumber;
	}

}
