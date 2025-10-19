package Problems;
import java.util.*;

public class RelativeRanks {
	class Solution {
	    public String[] findRelativeRanks(int[] score) {
	        int len = score.length;
	        int[] copyScore = new int[len];        
	        for(int i = 0;  i < len;  i++) {
	            copyScore[i] = score[i];
	        }

	        Map<Integer, Integer> hshMap = new TreeMap<>(Comparator.reverseOrder());

	        for(int i = 0; i < len; i++) {
	            hshMap.put(copyScore[i], i);
	        }

	        String[] ans = new String[len];
	        int rank = 1;
	        for(var entry: hshMap.entrySet()) {
	            int index = entry.getValue();
	            if(rank == 1) {
	                ans[index] = "Gold Medal";
	            }
	            else if(rank == 2) {
	                ans[index] = "Silver Medal";
	            }
	            else if(rank == 3) {
	                ans[index] = "Bronze Medal";
	            }
	            else {
	                ans[index] = rank + "";
	            }    
	            rank++;        
	        }
	        return ans;        
	    }	    
	}
}
