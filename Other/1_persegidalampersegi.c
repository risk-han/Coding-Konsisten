#include <stdio.h>

int main()
{
    int a,sum = 0,count = 1;

    scanf("%d", &a);

    while(count <= a)
    {
        sum = sum + (count * count);
        count++;
    }
    printf("%d", sum);

    return 0;
}
