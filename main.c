#include <stdio.h>

struct
{
    char title[500];
    char author[100];
    int value;
} b1; // 声明变量b1

int main()
{
    b1.value = 100;
    printf("%d", b1.value);
    return 0;
}
