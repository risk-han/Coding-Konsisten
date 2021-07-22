#include <iostream>

using namespace std;

int main(){
    int n;
    int i,j, result;
    cin >> n;

    for(i = 1; i<=n; i++){
        for(j = 1; j<=n; j++){
            // cout << (i - 1)*n + j << " ";
            if(j % 2 == 0 && i % 2 == 0)
            result += -1*((i - 1)*n +j);
            else if(j%2 == 1 && i % 2 == 1)
            result += -1*((i-1) *n +j);
            else
            result += (i-1)*n +j;
        }
    }
    cout << result;

    return 0;
}
