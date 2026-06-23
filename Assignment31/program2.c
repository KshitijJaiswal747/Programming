#include<stdio.h>

int CountSmall(char *str)
{
    int iCnt =0;
    while(*str != '\0')
    {
        if((*str >='a' ) && (*str <= 'z'))
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

    iRet = CountSmall(arr);

    printf("Number of Small characters are : %d\n",iRet);

    return 0;
}