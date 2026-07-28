#include <stdio.h>

int WhiteSpace(char *str)
{
    if(*str == '\0')
    {
        return 0;
    }

    if(*str == ' ')
    {
        return 1 + WhiteSpace(str + 1);
    }
    else
    {
        return WhiteSpace(str + 1);
    }
}

int main()
{
    char arr[50];
    int iRet = 0;

    printf("Enter string : ");
    scanf("%[^\n]", arr);

    iRet = WhiteSpace(arr);

    printf("White spaces = %d\n", iRet);

    return 0;
}