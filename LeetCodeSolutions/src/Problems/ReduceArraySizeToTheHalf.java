package Problems;
import java.util.*;

public class ReduceArraySizeToTheHalf {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        int n = arr.length;
        
        for(int num: arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> prQue = new PriorityQueue<>((a, b) -> b - a);

        for(int count: freq.values()) {
            prQue.offer(count);
        }

        int sets = 0;
        int removes = 0; 
        while(removes < n/2) {
            removes += prQue.poll();
            sets++;
        }

        return sets;
    }
}
