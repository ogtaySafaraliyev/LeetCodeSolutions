package Problems;
import java.util.*;

public class DeleteGreatestValueInEachRow {
    public int deleteGreatestValue(int[][] grid) {
        for(int[] row: grid) {
            Arrays.sort(row);
        }

        int sum = 0;

        for(int col = 0;  col < grid[0].length;  col++) {
            int max = 0;
            for(int row = grid.length - 1;  row >= 0;  row--) {
                max = Math.max(max, grid[row][col]);
            }
            sum += max;
        }
        return sum;
    }
}
