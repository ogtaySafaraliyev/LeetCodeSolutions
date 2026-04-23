package problems2;
import java.util.*; 

public class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {        
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int current = 1;
        int count = 0;

        while(true) {
            if(!set.contains(current)) {
                count++;
                if(count == k) {
                    return current;
                }
            }

            current++;
        }
    } 
}
