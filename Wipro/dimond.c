//Print the below pattern (half diamond using numbers)
#include <stdio.h>
int main()
{
  int i,j,s,N,count=0;
  scanf(“%d%d”,&s,&N);
  for(i=s;count<4;count++)
  {
    for(j=0;j<count+1;j++)
      printf(“%d”,i);
    printf(“\n”);
    i=i+1;
  }
  for(i=s+N-2;count>0;count–)
  {
    for(j=0;j<count-1;j++)
      printf(“%d”,i);
    printf(“\n”);
    i=i-1;
  }
  return 0;
}
