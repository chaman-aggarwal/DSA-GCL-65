#include <iostream>
using namespace std;

int* productExceptSelf(int arr[], int n) {
    
    int* ans = new int[n];
    ans[0] = arr[0];
    for(int i = 1; i < n; i++) {
        ans[i] = ans[i-1] * arr[i];
    }
    
    int rightProduct = 1; 
    for(int i = n-1; i >= 1; i--) {
        ans[i] = ans[i-1] * rightProduct;
        rightProduct *= arr[i]; 
    }
    ans[0] = rightProduct;
    
    return ans;
}

int main() {

    int n;
    cin>>n;
    int arr[n];
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }
    
    int* ans = productExceptSelf(arr, n);
    
    for (int i = 0; i < n; i++) {
        cout<<ans[i] << ", ";
    }

    return 0;
}
