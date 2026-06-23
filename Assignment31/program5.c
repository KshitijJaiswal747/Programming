#include<stdio.h>

void Reverse(char *str)
{
   int iLength = 0;
   int iCnt = 0;

   while((str[iLength]  != '\0'))
   {
    iLength++;
   }

   for(iCnt = iLength-1; iCnt >=0; iCnt--)
   {
    printf("%c",str[iCnt]);
   }
   printf("\n");
}

int main()
{
    char arr[50];

    printf("Enter string ; ");
    scanf(" %[^'\n]s",arr);

    Reverse (arr);
}