// You are given N identical eggs and you have access to a K-floored building from 1 to K.

// There exists a floor f where 0 <= f <= K such that any egg dropped at a floor higher than f will break, and any egg dropped at or below floor f will not break. There are few rules given below. 

// An egg that survives a fall can be used again.
// A broken egg must be discarded.
// The effect of a fall is the same for all eggs.
// If the egg doesn't break at a certain floor, it will not break at any floor below.
// If the eggs breaks at a certain floor, it will break at any floor above.
// Return the minimum number of moves that you need to determine with certainty what the value of f is.


class Solution 
{
    //Function to find minimum number of attempts needed in 
    //order to find the critical floor.
    static int eggDrop(int n, int k) 
	{
	    // Your code here
	    int dp[][] = new int[k+1][n+1];
	    for(int i=1; i<=n; i++){
	        dp[0][i]=0; dp[1][i]=1;
	    }
	    for(int i=1; i<=k; i++){
	        dp[i][1]=i;
	    }
	    for(int i=2; i<=k; i++){
	        for(int j=2; j<=n; j++){
	            dp[i][j]=Integer.MAX_VALUE;
	            for(int kth=1; kth<=i; kth++){
	                dp[i][j]=Math.min(dp[i][j],Math.max(dp[kth-1][j-1],dp[i-kth][j])+1);
	            }
	        }
	    }
	    return dp[k][n];
	}
}
