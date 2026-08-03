#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
#include<io.h>

void DisplayN(char FName[], int iSize)
{
    int fd = 0, iRet = 0;
    char Buffer[1024];

    fd = open(FName, O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file\n");
        return;
    }

    iRet = read(fd, Buffer, iSize);

    if(iRet > 0)
    {
        Buffer[iRet] = '\0';
        printf("%s\n", Buffer);
    }

    close(fd);
}

int main()
{
    char FileName[30];
    int iValue = 0;

    printf("Enter file name : ");
    scanf("%s", FileName);

    printf("Enter number of characters : ");
    scanf("%d", &iValue);

    DisplayN(FileName, iValue);

    return 0;
}