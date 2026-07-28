#include <stdio.h>

int Reverse(int iNo)
{
    static int iRev = 0;

    if(iNo == 0)
    {
        return iRev;
    }

    iRev = (iRev * 10) + (iNo % 10);

    return Reverse(iNo / 10);
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number : ");
    scanf("%d", &iValue);

    iRet = Reverse(iValue);

    printf("Reverse = %d\n", iRet);

    return 0;
}