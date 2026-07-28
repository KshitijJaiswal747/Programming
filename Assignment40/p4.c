#include <stdio.h>

void Display(int iNo)
{
    static char ch = 'A';

    if(iNo == 0)
    {
        return;
    }

    printf("%c ", ch);
    ch++;

    Display(iNo - 1);
}

int main()
{
    int iValue = 0;

    printf("Enter number: ");
    scanf("%d", &iValue);

    Display(iValue);

    return 0;
}