package Problems;
import java.util.*;

public class DivideArrayIntoArraysWithMaxDifference {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;

        int[][] ansArr = new int[n / 3][3];

       for(int i=0;  i<n;  i += 3) {
            int[] subarray = Arrays.copyOfRange(nums, i, i+3);

            if(subarray[2] - subarray[0] > k) {
                return new int[][] {};
            }
            ansArr[i/3] = subarray; 
       }
       return ansArr;
        
    }
}
