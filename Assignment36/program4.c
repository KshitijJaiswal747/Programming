#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo)
{
    UINT iMask = 0x00000240;   // 7th + 10th bits

    iNo = iNo ^ iMask;

    return iNo;
}

int main()
{
    UINT iValue = 0;
    UINT iRet = 0;

    printf("Enter number : ");
    scanf("%u",&iValue);

    iRet = ToggleBit(iValue);

    printf("Modified number is : %u\n",iRet);

    return 0;
}