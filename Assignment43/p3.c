#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
#include<io.h>

int CountWhite(char FName[])
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
            if(Buffer[i] == ' ')
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
    int iRet = 0;

    printf("Enter file name : ");
    scanf("%s", FileName);

    iRet = CountWhite(FileName);

    printf("Number of White Spaces are : %d\n", iRet);

    return 0;
}