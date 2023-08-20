#include<bits/stdc++.h>
using namespace std;

int power(int a, int b)
{
    // base case
    if(b==0) {
        return 1;
    }
    return a*power(a, b-1);
}

// int powerOptimised(int a, int b)
// {
//     if(b==0) {
//         return 1;
//     }
    
//     int halfPower = powerOptimised(a, b/2);
//     if (b%2 == 0) {
//         return halfPower*halfPower;
//     } else {
//         return a*halfPower*halfPower;
//     }
// }

int main(){
    int a,b;
    cin>>a>>b;
    cout<<power(a,b);
    return 0;
}