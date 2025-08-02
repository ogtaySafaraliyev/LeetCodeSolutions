package Problems;
import java.util.*;

public class MaximumNumberOfIntegersToChooseFromARangeI {
	public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> hshSet = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int num: banned) {
            hshSet.add(num);
        }

        for(int i = 1; i <= n; i++) {
            list.add(i);
        }

        list.removeIf(hshSet :: contains);

        int total = 0;
        int count = 0;
        for(int i: list) {
            if(total + i > maxSum) {
                break;
            }
            total += i;
            count++;
        }
        return count;        
    }
}
