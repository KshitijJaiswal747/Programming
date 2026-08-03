#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
#include<io.h>

int main()
{
    char FileName[30];
    int fd = 0;

    printf("Enter file name : ");
    scanf("%s", FileName);

    fd = open(FileName, O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file\n");
    }
    else
    {
        printf("File opened successfully\n");
        close(fd);
    }

    return 0;
}