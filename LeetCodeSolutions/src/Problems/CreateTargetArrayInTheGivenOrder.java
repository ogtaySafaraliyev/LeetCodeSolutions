package Problems;
import java.util.*;
public class CreateTargetArrayInTheGivenOrder {
	public int[] createTargetArray(int[] nums, int[] index) {
        int[] ansArr = new int[nums.length];
        List<Integer> list = new ArrayList<>();

        for(int i=0;  i<index.length;  i++) {
            list.add(index[i], nums[i]);
        }
        
        int i=0;
        for(Integer num: list) {
            ansArr[i++] = num;            
        }
        return ansArr;
    }
}
