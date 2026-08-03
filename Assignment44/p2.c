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

    fd = open(FileName, O_CREAT | O_RDWR, 0777);

    if(fd == -1)
    {
        printf("Unable to create file\n");
    }
    else
    {
        printf("File created successfully\n");
        close(fd);
    }

    return 0;
}