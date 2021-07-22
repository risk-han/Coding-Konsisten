#include <stdio.h>

int main(int argc, char const *argv[])
{
    int x,y;
    int i = 0, j = 0;

    scanf("%d %d", &x, &y);
    for(i = 0; i < x; i++){
        for(j = 0; j < y; j++){
            if(j%2 == 0)
            printf("B");
            else 
            printf("W");
        }
        printf("\n");
    }



    return 0;
}
