https://leetcode.com/problems/merge-intervals/

class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        
        sort(intervals.begin(), intervals.end());
        
        vector<vector<int>> result;
        int start = intervals[0][0];
        int end = intervals[0][1];
        
        for (int i=1; i<intervals.size(); i++) {
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];
            
            // overlapping
            if (nextStart <= end) {
                end = max(end, nextEnd);
            } else {
                result.push_back({start, end});
                start = nextStart;
                end = nextEnd;
            }
        }

        result.push_back({start, end});
        return result;
    }
};