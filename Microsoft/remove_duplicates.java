// Java program to remove duplicates, the order of 
// characters is not maintained in this program 
  
import java.util.*; 
  
public class GFG  
{ 
     // Driver Method 
     public static void main(String[] args) 
     { 
         String str = "malayalam"; 
         System.out.println(removeDups(str)); 
     } 

    static String removeDupsSorted(String str) 
    { 
        int res_ind = 1, index = 1; 
           
        char arr[] = str.toCharArray(); 
          
        while (index != arr.length) 
        { 
            if(arr[index] != arr[index-1]) 
            { 
                arr[res_ind] = arr[index]; 
                res_ind++; 
            } 
            index++; 
            
        } 
      
        str = new String(arr); 
        return str.substring(0,res_ind); 
    } 
       
    /* Method removes duplicate characters from the string 
       This function work in-place and fills null characters 
       in the extra space left */
    static String removeDups(String str) 
    { 
       // Sort the character array 
       char temp[] = str.toCharArray(); 
       Arrays.sort(temp); 
       str = new String(temp); 
         
       // Remove duplicates from sorted 
       return removeDupsSorted(str); 
    } 
} 
