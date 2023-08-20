#include<bits/stdc++.h>
using namespace std;

void merge(vector<int> &arr, int start, int mid, int end) {
    vector<int> temp(end-start+1);
    int i=start, j=mid+1, k=0;

    while (i <= mid && j <= end) {
        if (arr[i] < arr[j]) {
            temp[k++] = arr[i++];
        } else {
            temp[k++] = arr[j++];
        }
    }

    while (i <= mid) {
        temp[k++] = arr[i++];
    }
    while (j <= end) {
        temp[k++] = arr[j++];
    }

    for (int i=0; i<k; i++) {
        arr[start+i] = temp[i];
    }
}

void mergeSort(vector<int> &arr, int start, int end) {
    if (start >= end) {
        return;
    }

    // 1. divide
    int mid = start + (end - start) / 2;

    // 2. recursively sort
    mergeSort(arr, start, mid); // left half
    mergeSort(arr, mid + 1, end); // right half

    // 3. merge
    merge(arr, start, mid, end);
}

int main() {
    int n;
    cin>>n;

    vector<int> arr(n);
    for (int i=0; i<n; i++) {
        cin>>arr[i];
    }

    mergeSort(arr, 0, n-1);

    for (int i:arr) {
        cout<<i<<", ";
    }

    return 0;
}
