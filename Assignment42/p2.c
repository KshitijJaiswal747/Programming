#include <stdio.h>

int Max(int iNo)
{
    static int iMax = 0;

    if(iNo == 0)
    {
        return iMax;
    }

    if((iNo % 10) > iMax)
    {
        iMax = iNo % 10;
    }

    return Max(iNo / 10);
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number : ");
    scanf("%d", &iValue);

    iRet = Max(iValue);

    printf("Largest digit = %d\n", iRet);

    return 0;
}