package problems3;
import java.util.*;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> ansList = new ArrayList<>();
        int[] current = intervals[0];
        ansList.add(current);

        for(int i = 1; i < intervals.length; i++) {
            if(current[1] >= intervals[i][0]) {
                current[1] = Math.max(intervals[i][1], current[1]);
            }
            else {
                current = intervals[i];
                ansList.add(current);
            }
        }
        return ansList.toArray(new int[ansList.size()][]);
    }
}
