package problems2;
import java.util.*;

public class ReorganizeString {
    public String reorganizeString(String s) {
        TreeMap<Character, Integer> freqMap = new TreeMap<>();

        for(char ch: s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        while(!freqMap.isEmpty()) {
            Character first = null;
            Character second = null;

            int maxFreq1 = 0;

            for(var entry: freqMap.entrySet()) {
                if(entry.getValue() > maxFreq1) {
                    maxFreq1 = entry.getValue();
                    first = entry.getKey();
                }                
            }

            int count1 = freqMap.get(first);
            freqMap.remove(first);

            int maxFreq2 = 0;

            for(var entry: freqMap.entrySet()) {
                if(entry.getValue() > maxFreq2) {
                    maxFreq2 = entry.getValue();
                    second = entry.getKey();
                }                
            }

            sb.append(first);
            count1--;

            if(second != null) {
                sb.append(second);
                int count2 = freqMap.get(second) - 1;

                if(count2 == 0) {
                    freqMap.remove(second);
                }
                else {
                    freqMap.put(second, count2);
                }

            }

            if(count1 > 0) {
                freqMap.put(first, count1);
            }
            
        }

        // validation
        for(int i = 1; i < sb.length(); i++) {
            if(sb.charAt(i) == sb.charAt(i - 1))
                return "";
        }
        
        return sb.toString();
    }
}
