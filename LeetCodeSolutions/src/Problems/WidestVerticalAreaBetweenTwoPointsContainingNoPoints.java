package Problems;

import java.util.Arrays;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] arr = new int[points.length];
        
        for(int i=0;  i<points.length;  i++) {            
            arr[i] = points[i][0];                      
        }

        Arrays.sort(arr);
        // 7  8  9
        // 1  3  5  8  9
        int max = 0;
        for(int i=1;  i<arr.length;  i++) {
            max = Math.max((arr[i] - arr[i-1]), max);
        }
        
        return max;
    }
}
