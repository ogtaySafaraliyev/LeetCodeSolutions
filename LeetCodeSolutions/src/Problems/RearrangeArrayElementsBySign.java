package Problems;
import java.util.*;

public class RearrangeArrayElementsBySign {
    public int[] rearrangeArray(int[] nums) {

        List<Integer> positiveNums = new ArrayList<Integer>();
        List<Integer> negativeNums = new ArrayList<Integer>();
        
        for(Integer number: nums) {
            if(number>=0) {
                positiveNums.add(number);
            }
            else{
                negativeNums.add(number);
            }
        }

        int[] ansArr = new int[nums.length];

        for(int i=0; i<positiveNums.size();  i++){
            ansArr[i*2] = positiveNums.get(i);
            ansArr[i*2+1] = negativeNums.get(i);
        }
        return ansArr;
        
    }
}
