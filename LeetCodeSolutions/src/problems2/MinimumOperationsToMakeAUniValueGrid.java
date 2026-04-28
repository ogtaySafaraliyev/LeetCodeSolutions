package problems2;
import java.util.*;

public class MinimumOperationsToMakeAUniValueGrid {
    public int minOperations(int[][] grid, int x) {
        int rows = grid.length;
        int cols = grid[0].length;

        int[] flattenArr = new int[rows * cols];
        int firstReminder = grid[0][0] % x;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(firstReminder != grid[i][j] % x) {
                    return -1;
                }
                flattenArr[i * cols + j] = grid[i][j];
            }
        }

        Arrays.sort(flattenArr);
        
        int medianVal = flattenArr[flattenArr.length >> 1];

        int totalOperations = 0;
        for(int val: flattenArr) {
            totalOperations += Math.abs(val - medianVal) / x;
        }

        return totalOperations;
    }
}
