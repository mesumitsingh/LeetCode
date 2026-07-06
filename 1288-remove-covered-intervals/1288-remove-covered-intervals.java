import java.util.Arrays;

class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;

        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(b[1], a[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        int ans = n;
        int e = intervals[0][1];

        for (int i = 1; i < n; i++) {
            if (intervals[i][1] <= e) {
                ans--;                  
            } else {
                e = intervals[i][1];    
            }
        }

        return ans;
    }
}