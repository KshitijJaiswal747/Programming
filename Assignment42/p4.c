#include <stdio.h>

int Min(int iNo)
{
    static int iMin = 9;

    if(iNo == 0)
    {
        return iMin;
    }

    if((iNo % 10) < iMin)
    {
        iMin = iNo % 10;
    }

    return Min(iNo / 10);
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number : ");
    scanf("%d", &iValue);

    iRet = Min(iValue);

    printf("Smallest digit = %d\n", iRet);

    return 0;
}