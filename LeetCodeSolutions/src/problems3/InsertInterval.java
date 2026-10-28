package problems3;
import java.util.*;

public class InsertInterval {
	public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] all = Arrays.copyOf(intervals, intervals.length + 1);
        all[intervals.length] = newInterval;

        Arrays.sort(all, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> ansList = new ArrayList<>();
        int[] current = all[0];
        ansList.add(current);

        for (int i = 1; i < intervals.length + 1; i++) {
            if (current[1] >= all[i][0]) {
                current[1] = Math.max(all[i][1], current[1]);
            } else {
                current = all[i];
                ansList.add(current);
            }
        }
        return ansList.toArray(new int[ansList.size()][]);
    }
}
