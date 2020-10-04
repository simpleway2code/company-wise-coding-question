// Java A O(Logn) complexity program to count 
// set bits in all numbers from 1 to n 
import java.io.*; 

class GFG 
{ 
	
/* Returns position of leftmost set bit. 
The rightmost position is considered 
as 0 */
static int getLeftmostBit(int n) 
{ 
	int m = 0; 
	while (n > 1) 
	{ 
		n = n >> 1; 
		m++; 
	} 
	return m; 
} 

/* Given the position of previous leftmost 
set bit in n (or an upper bound on 
leftmost position) returns the new 
position of leftmost set bit in n */
static int getNextLeftmostBit(int n, int m) 
{ 
	int temp = 1 << m; 
	while (n < temp) 
	{ 
		temp = temp >> 1; 
		m--; 
	} 
	return m; 
} 

// The main recursive function used by countSetBits() 
// Returns count of set bits present in 
// all numbers from 1 to n 

static int countSetBits(int n) 
{ 
	// Get the position of leftmost set 
	// bit in n. This will be used as an 
	// upper bound for next set bit function 
	int m = getLeftmostBit(n); 

	// Use the position 
	return countSetBits(n, m); 
} 

static int countSetBits( int n, int m) 
{ 
	// Base Case: if n is 0, then set bit 
	// count is 0 
	if (n == 0) 
		return 0; 

	/* get position of next leftmost set bit */
	m = getNextLeftmostBit(n, m); 

	// If n is of the form 2^x-1, i.e., if n 
	// is like 1, 3, 7, 15, 31, .. etc, 
	// then we are done. 
	// Since positions are considered starting 
	// from 0, 1 is added to m 
	if (n == ((int)1 << (m + 1)) - 1) 
		return (int)(m + 1) * (1 << m); 

	// update n for next recursive call 
	n = n - (1 << m); 
	return (n + 1) + countSetBits(n) + m * (1 << (m - 1)); 
} 

// Driver code 
public static void main (String[] args) 
{ 

	int n = 17; 
	System.out.println ("Total set bit count is " + countSetBits(n)); 
} 
} 

// This code is contributed by ajit.. 
