#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
#include<io.h>

int main()
{
    char FileName[30];
    char Buffer[1024];
    int fd = 0, iRet = 0;
    int iSize = 0;

    printf("Enter file name : ");
    scanf("%s", FileName);

    fd = open(FileName, O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file\n");
        return -1;
    }

    while((iRet = read(fd, Buffer, sizeof(Buffer))) > 0)
    {
        iSize = iSize + iRet;
    }

    printf("File size is %d bytes\n", iSize);

    close(fd);

    return 0;
}