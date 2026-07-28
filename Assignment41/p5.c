#include <stdio.h>

int Mult(int iNo)
{
    if(iNo == 0)
    {
        return 1;
    }

    return (iNo % 10) * Mult(iNo / 10);
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number : ");
    scanf("%d", &iValue);

    iRet = Mult(iValue);

    printf("Product = %d", iRet);

    return 0;
}