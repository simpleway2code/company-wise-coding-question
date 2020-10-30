/*
Given two variables a and b we have to swap them without using a third variable.
*/

import java.util.*;
public class Swap2Numbers {
    public static void main(String arr[])   
    {   
        System.out.println("Enter the value of a and b");  
        Scanner sc = new Scanner(System.in);  
        /*Define variables*/  
        int a = sc.nextInt();  
        int b = sc.nextInt();  
        System.out.println("before swapping numbers: "+a +" "+ b);  
       /*Swapping*/  
        a = a + b;   
        b = a - b;   
        a = a - b;   
        System.out.println("After swapping: "+a +"  " + b);   
    }   
}