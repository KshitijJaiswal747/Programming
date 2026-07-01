#include<stdio.h>

typedef unsigned int UINT;

UINT OnBit(UINT iNo)
{
    UINT iMask = 0x0000000F;   // First 4 bits

    iNo = iNo | iMask;

    return iNo;
}

int main()
{
    UINT iValue = 0;
    UINT iRet = 0;

    printf("Enter number : ");
    scanf("%u",&iValue);

    iRet = OnBit(iValue);

    printf("Modified number is : %u\n",iRet);

    return 0;
}