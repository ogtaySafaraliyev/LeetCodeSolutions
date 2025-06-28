package Problems;
import java.util.*;

public class FindOccurrencesOfAnElementInAnArray {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> indices = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == x) {
                indices.add(i);
            }
        }

        int[] result = new int[queries.length];

        for(int i=0; i<result.length; i++) {
            int queryIndex = queries[i] - 1;
            result[i] = queryIndex < indices.size() ? indices.get(queryIndex) : -1;  
        }

        return result; 
    }
}
