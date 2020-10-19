/* Implement the following Function

def ProductSmallestPair(sum, arr)

The function accepts an integers sum and an integer array arr of size n. Implement the function to find the pair, (arr[j], arr[k]) where j!=k, Such that arr[j] and arr[k] are the least two elements of array (arr[j] + arr[k] <= sum) and return the product of element of this pair

NOTE

    Return -1 if array is empty or if n<2
    Return 0, if no such pairs found
    All computed values lie within integer range

Example

Input

sum:9

Arr:5 2 4 3 9 7 1

Output

2

Explanation

Pair of least two element is (2, 1) 2 + 1 = 3 < 9, Product of (2, 1) 2*1 = 2. Thus, output is 2

Sample Input

sum:4

Arr:9 8 3 -7 3 9

Sample Output

-21  
*/

//Solution 

#include<stdio.h>;
 
int productSmallestPair(int *array, int n, int sum)
{
    int answer, temp, i, j, check;
    if(n<=2)
    {
        answer = -1;
    }
    else
    {
        for(i=0; i<n; i++)          //sorting of array
        {
            for(j=i+1; j<n; j++)
            {
                if(array[i]>array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        check = array[0] + array[1];
        if(check<=sum)
        {
            answer = array[0] * array[1];
        }
        else
        {
            answer = 0;
        }   
    }
    return answer;
}
 
int main()
{
    int n, sum, result, i;
    scanf("%d",&sum);
    scanf("%d",&n);
    int array[n];
    for(i=0; i<n; i++)
    {
        scanf("%d",&array[i]);
    }
    result = productSmallestPair(array, n, sum);
    printf("%d",result);
    return 0;
}
