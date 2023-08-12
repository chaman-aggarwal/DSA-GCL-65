https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

class Solution {

    int countDays(vector<int> &weights, int capacity) {
        int days = 1; 
        int currLoad = 0;
        for (int weight: weights) {
            currLoad += weight;
            if (currLoad > capacity) {
                days += 1;
                currLoad = weight;
            }
        }
        return days;
    }

public:
    int shipWithinDays(vector<int>& weights, int days) {

        int start = 0, end = 0;
        for (int weight: weights) {
            start = max(start, weight);
            end += weight;
        }

        while (start <= end) {
            int mid = (start + end) / 2; 
            int numberOfDaysReq = countDays(weights, mid);
            if (numberOfDaysReq <= days) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
};