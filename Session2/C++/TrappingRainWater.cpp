#include<iostream>
using namespace std;

// O(N) space
int trappingRainWater(int arr[], int n)
{
    int leftMax[n];
    int rightMax[n];
    
    leftMax[0] = arr[0];
    for(int i=1; i<n; i++) {
        leftMax[i] = max(leftMax[i-1], arr[i]);
    }
    
    rightMax[n-1] = arr[n-1];
    for(int i=n-2; i>=0; i--) {
        rightMax[i] = max(rightMax[i+1], arr[i]);
    }
    
    int water = 0;
    for(int i=1; i<n-1; i++) {
        water += min(leftMax[i], rightMax[i]) - arr[i];
    }
    
    return water;
}

// O(1) Space
// int trappingRainWater(int arr[], int n) {
//     int left=0; 
//     int right=n-1;
//     int water=0;
//     int maxleft=0, maxright=0;

//     while(left < right){
//         if(arr[left] <= arr[right]){
//             if(arr[left] >= maxleft) {
//                 maxleft = arr[left];
//             }
//             else {
//                 water += maxleft - arr[left];
//             }
//             left++;
//         }
//         else{
//             if(arr[right] >= maxright) {
//                 maxright = arr[right];
//             }
//             else {
//                 water += maxright-arr[right];
//             }
//             right--;
//         }
//     }
//     return water;
// }

int main(){

    int n;
    cin>>n;
    int arr[n];
    for(int i=0; i<n; i++)
    {
        cin>>arr[i];
    }
    cout<<trappingRainWater(arr, n);
    return 0;
}  