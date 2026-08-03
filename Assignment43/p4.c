#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
#include<io.h>

int CountChar(char FName[], char Ch)
{
    int fd = 0, iRet = 0, i = 0, iCount = 0;
    char Buffer[1024];

    fd = open(FName, O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file\n");
        return -1;
    }

    while((iRet = read(fd, Buffer, sizeof(Buffer))) > 0)
    {
        for(i = 0; i < iRet; i++)
        {
            if(Buffer[i] == Ch)
            {
                iCount++;
            }
        }
    }

    close(fd);
    return iCount;
}

int main()
{
    char FileName[30];
    char cValue;
    int iRet = 0;

    printf("Enter file name : ");
    scanf("%s", FileName);

    printf("Enter character : ");
    scanf(" %c", &cValue);

    iRet = CountChar(FileName, cValue);

    printf("Frequency is : %d\n", iRet);

    return 0;
}