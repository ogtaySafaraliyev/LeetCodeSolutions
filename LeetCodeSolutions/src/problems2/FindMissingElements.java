package problems2;
import java.util.*; 

public class FindMissingElements {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        int smallestNum = Integer.MAX_VALUE;
        int greatestNum = Integer.MIN_VALUE;

        for(int num: nums) {
            smallestNum = Math.min(smallestNum, num);
            greatestNum = Math.max(greatestNum, num);
            
            set.add(num);
        }

        for(int i = smallestNum; i <= greatestNum; i++) {
            if(!set.contains(i)) {
                list.add(i);
            }
        }

        return list;
    }
}
