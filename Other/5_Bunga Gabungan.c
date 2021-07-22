#include <stdio.h>

int main()
{
    int a,b, c;
    scanf("%d %d", &a, &b);

    c = a * a + b * b + 1;
    if (c % 4 == 0)
    {
        printf("%d", c/4);
    } else 
    {
        printf("-1");
    }

}
