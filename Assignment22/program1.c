#include<stdio.h>

void Pattern(int iNo)
{
    char ch = 'A';

    for(int i = 1; i <= iNo; i++)
    {
        printf("%c ", ch);
        ch++;
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number of elements : ");
    scanf("%d", &iValue);

    Pattern(iValue);

    return 0;
}