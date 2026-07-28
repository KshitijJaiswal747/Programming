#include <stdio.h>

int Strlen(char *str)
{
    if(*str == '\0')
    {
        return 0;
    }

    return 1 + Strlen(str + 1);
}

int main()
{
    char arr[20];
    int iRet = 0;

    printf("Enter string : ");
    scanf("%s", arr);

    iRet = Strlen(arr);

    printf("Length = %d", iRet);

    return 0;
}