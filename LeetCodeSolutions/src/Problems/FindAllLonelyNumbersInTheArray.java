package Problems;
import java.util.*;

public class FindAllLonelyNumbersInTheArray {
    public List<Integer> findLonely(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int i = 0; i < nums.length;  i++) {            
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int number: freq.keySet()) {
            if(freq.get(number) == 1 && !freq.containsKey(number - 1) && !freq.containsKey(number + 1)) {
                list.add(number);
            }
        }

        return list;
    }
}
