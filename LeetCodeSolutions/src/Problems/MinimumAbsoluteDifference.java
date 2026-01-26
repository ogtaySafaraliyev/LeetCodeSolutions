package Problems;
import java.util.*;

public class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {        
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);      // 1, 2, 3, 4
        
        for(int i = 0, j = 1;  i < arr.length - 1;  i++, j++) {
            int diff = arr[j] - arr[i];
            min = Math.min(min, diff);            
        }

        List<List<Integer>> list = new ArrayList<>();
        
        for(int i = 0, j = 1;  i < arr.length - 1;  i++, j++) {
            int diff = arr[j] - arr[i];
            if(min == diff) {
                list.add(new ArrayList<>(Arrays.asList(arr[i], arr[j])));
            }
        }
        return list;
    }
}
