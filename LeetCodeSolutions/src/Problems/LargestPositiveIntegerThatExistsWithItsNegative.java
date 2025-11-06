package Problems;
import java.util.*;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    public int findMaxK(int[] nums) {
        HashSet<Integer> hshSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for(int num: nums) {            
            hshSet.add(num);
        }
        
        for(int num: hshSet) {
            int negative = num * (-1);
            if(hshSet.contains(negative)) {
                treeSet.add(num);
            }
        }
        return treeSet.isEmpty() ? -1 : treeSet.last();
    }
}
