package problems3;
import java.util.*;

public class DigitFrequencyScore {
    public int digitFrequencyScore(int n) {
        int ans = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        while(n > 0) {
            int digit = n % 10;
            freq.put(digit, freq.getOrDefault(digit, 0) + 1);
            n /= 10;
        }

        for(var entry: freq.entrySet()) {
            ans += entry.getValue() * entry.getKey();
        }
        return ans;        
    }
}
