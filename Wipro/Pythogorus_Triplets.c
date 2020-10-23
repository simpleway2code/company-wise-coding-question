/*A Pythagorean triplet is a set of three integers a, b and c such that a2 + b2 = c2. Given a limit, generate all Pythagorean Triples with values smaller than given limit.

Input : limit = 20
Output : 3 4 5
         8 6 10
         5 12 13
         15 8 17
         12 16 20
*/

// A C program to generate pythagorean triplets
// smaller than a given limit
#include <conio.h>
#include <stdio.h>

//  Function to generate pythagorean triplets
//  smaller than limit
void pythagoreanTriplets(int limit)
{
// triplet:  a^2 + b^2 = c^2
int a, b, c=0;

//  loop from 2 to max_limitit
int m = 2;

// Limiting c would limit all a, b and c
while (c < limit)
{
// now loop on j from 1 to i-1
for (int n = 1; n < m; ++n)
{
// Evaluate and print triplets using
// the relation between a, b and c
a = m*m – n*n;
b = 2*m*n;
c = m*m + n*n;

if (c > limit)
break;

printf(“%d %d %d\n”, a, b, c);
}
m++;
}
}

// Driver program
int main()
{
int limit = 20;
pythagoreanTriplets(limit);
return 0;
}
