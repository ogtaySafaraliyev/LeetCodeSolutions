package problems3;
import java.util.*;

public class SummaryRanges {
	public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            int start = nums[i];

            while(i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
                i++;                                
            }

            list.add(start == nums[i] ? String.valueOf(start) : start + "->" + nums[i]);
        }
        return list;
    }
}
