https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1#

bool subArrayExists(int arr[], int n)
{
    unordered_set<int> prefixSums;
    int prefixSum = 0;
    
    for(int i=0; i<n; i++) {
        prefixSum += arr[i];
        if(prefixSum==0 || prefixSums.count(prefixSum)) {
            return true;
        }
        prefixSums.insert(prefixSum);
    }
    
    return false;
}