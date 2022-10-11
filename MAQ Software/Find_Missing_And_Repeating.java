// Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2, …N} is missing and one number 'B' occurs twice in array. Find these two numbers.

import java.io.*;

import java.util.*;

 

class GFG {

    // Driver code

    public static void main(String[] args) throws Exception {

        BufferedReader br =

            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {

            int n = Integer.parseInt(br.readLine().trim());

            String[] str = br.readLine().split(" ");

 

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {

                a[i] = Integer.parseInt(str[i]);

            }

 

            int[] ans = new Solve().findTwoElement(a, n);

            System.out.println(ans[0] + " " + ans[1]);

        }

    }

}