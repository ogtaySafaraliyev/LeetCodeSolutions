package problems2;
import java.util.*;

public class RemoveCoveredIntervals {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if(a[0] == b[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });

        int maxRight = intervals[0][1];
        int ans = 1;

        for(int i = 1; i < intervals.length; i++) {
            if(maxRight >= intervals[i][1]) {
                //that means current array is covered already
                continue;
            }

            ans++;
            maxRight = intervals[i][1];
        }
        return ans;
    }
}
