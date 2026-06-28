package problems2;
import java.util.*;

public class MaximumElementAfterDecreasingAndRearranging {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);        
        arr[0] = 1;

        for(int i = 1;  i < arr.length; i++) {
            int exceedDiff = Math.max(0, arr[i] - arr[i - 1] - 1);
            arr[i] -= exceedDiff;            
        }
        return arr[arr.length - 1];
    }
}
