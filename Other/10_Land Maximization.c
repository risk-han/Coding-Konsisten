#include <stdio.h>

int main()
{
    int a, sum, a1, a2, finsum;
    scanf("%d", &a);
    sum = a * a;
    a1 = ((sum/2) * -1);
    a2 = (sum/2 + 1) * -1;

    finsum = (a/a) + a1 + a/2 + a2 + (a * a);

    printf("%d", sum); 
    printf("\na1 = %d", a1);
    printf("\na2 = %d", a2);
    printf("\nfinal result = %d", finsum);

    return 0;
}
