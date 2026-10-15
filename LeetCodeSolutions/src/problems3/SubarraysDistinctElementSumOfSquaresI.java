package problems3;
import java.util.*;

public class SubarraysDistinctElementSumOfSquaresI {
	public int sumCounts(List<Integer> nums) {
        int totalSum = 0;
        int len = nums.size(); 

        for(int i = 0; i < len; i++) {
            int[] freq = new int[101];
            int distinctCount = 0;

            for(int j = i; j < len; j++) {
                int currElmnt = nums.get(j);

                freq[currElmnt]++;
                if(freq[currElmnt] == 1) {
                    distinctCount++;
                }
                totalSum += distinctCount * distinctCount;
            }            
        }
        return totalSum;
    }
}
