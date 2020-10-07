// An array of size N consisting of only 0's and 1's . 
// Sorted in manner that all 1's are placed first and then 
//  they are followed by all 0's.

import java.util.*;

public class Solution{
   public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);

    //    Taking length of array as a intput

    int length_of_array = sc.nextInt();

    int array[] = new int[length_of_array];

    // Taking input of array elements/

    for(int i =0; i<length_of_array; i++){
        array[i] = sc.nextInt();
    }

    // Two ways you can go

    // first method

    int zeros = 0;
    for(int i =0; i<length_of_array; i++){
        if(array[i] == 0){
            zeros++;
        }
    }
        
      System.out.println(zeros);

    //   Second method using sorted property..
     
     int one =-1;
    for(int i =0; i<length_of_array; i++){
     if(array[i] == 0){
         one = i;
         break;
       }
    }
        if(one == -1){
            System.out.println("0");
        }else{
    int no_of_zeros = length_of_array - one;
      System.out.println(no_of_zeros);
}
   }
}













