/*
 * Problem: Given an array of size 10 containing numbers from 1 to 10. There is one missing 
 * and one repeating element. Find them.
 * Example :
 * Input : { 1, 2, 3, 4, 5, 6, 7, 2, 9, 10 }
 * Output : 
 * Repeating = 2 
 * Missing = 8
 */

import java.util.*;

public class FindMissingAndDuplicateNumber {

     
    public static void main(String[] args) 
    { 
  
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 2, 9, 10 }; 
  
        Map<Integer, Boolean> hm = new HashMap<>(); 
  
        int max = arr.length; 
  
        for (int i = 0; i < arr.length; i++) { 
  
            if (!hm.containsKey(arr[i])) { 
                hm.put(arr[i], true); 
            } 
            else { 
                System.out.println("Repeating = " + arr[i]); 
            } 
        } 
        for (int i = 1; i <= max; i++) { 
            if (hm.get(i) == null) { 
                System.out.println("Missing = " + i); 
            } 
        } 
    }
}