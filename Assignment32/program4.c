#include<stdio.h>

void DisplayDigit(char *str)
{
    while(*str != '\0')
    {
        if((*str >= '0') && (*str <= '9'))
        {
            printf("%c", *str);
        }
        str++;
    }

    printf("\n");
}

int main()
{
    char arr[50];

    printf("Enter string : ");
    scanf("%[^\n]s", arr);

    DisplayDigit(arr);

    return 0;
}