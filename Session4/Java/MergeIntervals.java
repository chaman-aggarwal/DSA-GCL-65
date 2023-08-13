https://leetcode.com/problems/merge-intervals/

class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i=1; i<intervals.length; i++) {
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            if (nextStart <= end) {
                end = Math.max(end, nextEnd);
            } else {
                res.add(new int[]{start, end});
                start = nextStart;
                end = nextEnd;
            }
        }

        res.add(new int[]{start, end});
        return res.toArray(new int[res.size()][]);
    }
}