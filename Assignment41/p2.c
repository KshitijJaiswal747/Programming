#include <stdio.h>

int Sum(int iNo)
{
    if(iNo == 0)
    {
        return 0;
    }

    return (iNo % 10) + Sum(iNo / 10);
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number : ");
    scanf("%d", &iValue);

    iRet = Sum(iValue);

    printf("Sum = %d", iRet);

    return 0;
}