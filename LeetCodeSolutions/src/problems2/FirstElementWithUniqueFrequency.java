package problems2;
import java.util.*;

public class FirstElementWithUniqueFrequency {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Integer> freqOfFreq = new HashMap<>();

        for(int num: nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for(int val: freq.values()) {
            freqOfFreq.put(val, freqOfFreq.getOrDefault(val, 0) + 1);
        }     

        for(int num: nums) {
            int freqVar = freq.get(num);
            int freqOfFreqVar = freqOfFreq.get(freqVar);

            if(freqOfFreqVar == 1) {
                return num;
            }
        }
        return -1;
    }
}
