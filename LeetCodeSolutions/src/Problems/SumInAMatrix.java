package Problems;
import java.util.*;

public class SumInAMatrix {
    public int matrixSum(int[][] nums) {
        for(int[] row: nums) {
            Arrays.sort(row);
        }

        int ans = 0;
        for(int row = 0; row < nums[0].length; row++) {            
            int max = 0;            
            for(int col = 0; col < nums.length;  col++) {
                max = Math.max(max, nums[col][row]);
            }
            ans += max;
        }
        return ans;
    }
}
