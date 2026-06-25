#include<stdio.h>

void StrCatX(char *dest, char *src)
{
    while(*dest != '\0')
    {
        dest++;
    }

    *dest = ' ';
    dest++;

    while(*src != '\0')
    {
        *dest = *src;
        dest++;
        src++;
    }

    *dest = '\0';
}

int main()
{
    char arr[50] = "Marvellous Infosystems";
    char brr[30] = "Logic Building";

    StrCatX(arr, brr);

    printf("%s\n", arr);

    return 0;
}