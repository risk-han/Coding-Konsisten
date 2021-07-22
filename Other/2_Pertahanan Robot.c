#include <stdio.h>

int main()
{   int x=0,y=0,i=0;
    char str[100];

    scanf("%[^\n]", str);
    for(i = 0; str[i] != '\0'; i++)
    {
        if(str[i] == 'R')
        {
            x = 1 + x;
        }else if (str[i] == 'L')
        {
            x = -1 + x;
        }else if(str[i] == 'U')
        {
            y = 1 + y;
        }else if(str[i] == 'D')
        {
            y = -1 + y;
        }else 
        {
            continue;
        }
    }
    printf("%d %d", x,y);

    return 0;
}
