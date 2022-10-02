package Adobe;

public class SearchIn2DMatrix {

    /*  Given an n x n matrix and an integer x, find the position of x in the matrix if it is present. 
        Otherwise, print “Element not found”. Every row and column of the matrix is sorted in increasing order.
        The designed algorithm should have linear time complexity

        Input: mat[4][4] = { {10, 20, 30, 40},  
                             {15, 25, 35, 45},
                             {27, 29, 37, 48},
                             {32, 33, 39, 50}}
               target = 29
        
        Output: Found at (2, 1)
    */

    private static void search(int[][] mat, int n, int x)
    {
 
        // set indexes for top right
        int i = 0, j = n - 1;
        // element
 
        while (i < n && j >= 0) {
            if (mat[i][j] == x) {
                System.out.print("Element found at " + i
                                 + " " + j);
                return;
            }
            if (mat[i][j] > x)
                j--;
            else // if mat[i][j] < x
                i++;
        }
 
        System.out.print("n Element not found");
        return; // if ( i==n || j== -1 )
    }
    // Driver code
    public static void main(String[] args)
    {
        int mat[][] = { { 10, 20, 30, 40 },
                        { 15, 25, 35, 45 },
                        { 27, 29, 37, 48 },
                        { 32, 33, 39, 50 } };
 
        // Function call
        search(mat, 4, 29);
    }
}
