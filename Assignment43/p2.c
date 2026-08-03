#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
#include<io.h>

int CountSmall(char FName[])
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
            if(Buffer[i] >= 'a' && Buffer[i] <= 'z')
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

    iRet = CountSmall(FileName);

    printf("Number of Small characters are : %d\n", iRet);

    return 0;
}