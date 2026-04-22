package problems2;
import java.util.*;

public class MaximumTotalImportanceOfRoads {
    public long maximumImportance(int n, int[][] roads) {
        // 1 * 1   2 * 2   3 * 2    3 * 4    4 * 5
        int[] degree = new int[n];

        for(int[] road: roads) {
            degree[road[0]]++;
            degree[road[1]]++;
        }  

        Arrays.sort(degree);
        long totalImportance = 0;
        for(int i = 0; i < n; i++) {
            totalImportance += (long)(i + 1) * degree[i];
        }

        return totalImportance;
    }
}
