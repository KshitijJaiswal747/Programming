#include<stdio.h>

int CountCapital(char *str)
{
    int iCnt =0;
    while(*str != '\0')
    {
        if((*str >='A' ) && (*str <= 'Z'))
        {
            iCnt++;
        }
        str++;
    }
    return iCnt;
}

int main()
{
    char arr[50];
    int iRet = 0;

    printf("Enter string : ");
    scanf("%[^'\n']s",arr);

    iRet = CountCapital(arr);

    printf("Number of capital characters are : %d\n",iRet);

    return 0;
}