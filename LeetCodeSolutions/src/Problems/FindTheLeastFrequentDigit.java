package Problems;
import java.util.*;

public class FindTheLeastFrequentDigit {
    public int getLeastFrequentDigit(int n) {
        Map<Integer, Integer> hshMap = new TreeMap<>();

        while(n > 0) {
            int digit = n % 10;
            n /= 10;
            hshMap.put(digit, hshMap.getOrDefault(digit, 0) + 1);
        }

        int min = Integer.MAX_VALUE;       

        for(int count: hshMap.values()) {
            min = Math.min(count, min);
        }

        for(var entry: hshMap.entrySet()) {
            if(entry.getValue() == min) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
