#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
#include<io.h>
#include<string.h>

int main()
{
    char FileName[30];
    char Data[100];
    int fd = 0;

    printf("Enter file name : ");
    scanf("%s", FileName);

    printf("Enter string : ");
    scanf(" %[^\n]", Data);

    fd = open(FileName, O_WRONLY | O_APPEND);

    if(fd == -1)
    {
        printf("Unable to open file\n");
        return -1;
    }

    write(fd, Data, strlen(Data));

    close(fd);

    printf("Data written successfully\n");

    return 0;
}