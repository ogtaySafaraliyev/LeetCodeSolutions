package Problems;
import java.util.*;

public class ReplaceElementsInAnArray {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer, Integer> hshMap = new HashMap<>();

        for(int i = 0;  i < nums.length;  i++) {
            hshMap.put(nums[i], i);
        }

        for(int[] operation: operations) {
            int olderOne = operation[0];
            int newOne = operation[1];

            int index = hshMap.get(olderOne);           

            hshMap.put(newOne, index);
            nums[index] = newOne;
        }

        return nums;
    }
}
