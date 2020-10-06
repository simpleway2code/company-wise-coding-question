#include <stdio.h>
 
int findMissNumber(int *arr1, int arr_size) 
{
    int i, sum = 0, n = arr_size + 1; 
    for(i = 0; i < arr_size; i++)
	{
        sum = sum + arr1[i];
    }
    return (n*(n+1))/2 - sum;
}
int main()
{
    int i;
    int arr1[] = {1, 3, 4, 2, 5, 6, 9, 8};
 
    int ctr = sizeof(arr1)/sizeof(arr1[0]);
    printf("The given array is :  ");
	for(i = 0; i < ctr; i++)
	{
	printf("%d  ", arr1[i]);
    } 
    printf("\n");
 printf("The missing number is : %d \n", findMissNumber(arr1, ctr));
 return 0;
}