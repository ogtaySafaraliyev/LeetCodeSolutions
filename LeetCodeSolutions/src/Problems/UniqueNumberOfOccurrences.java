package Problems;
import java.util.*;

public class UniqueNumberOfOccurrences {
    // public boolean uniqueOccurrences(int[] arr) {
    //     int[] freqncy = new int[2001];

    //     for(int num: arr) {
    //         freqncy[num + 1000]++;
    //     }

    //     Set<Integer> set = new HashSet<>();
    //     List<Integer> list = new ArrayList<>();

    //     for(int i=0;  i<freqncy.length;  i++) {
    //         if(freqncy[i] != 0){
    //             set.add(freqncy[i]);
    //             list.add(freqncy[i]);

    //         }            
    //     }

    //     if(set.size() == list.size()) {
    //         return true;
    //     }

    //     return false;
    // }

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int num: arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        Set<Integer> hshSet = new HashSet<>();
        for(int num: freq.values()) {
            if (!hshSet.add(num)) {
                return false; // duplicate found
            }
        }
        return true;
    }
}
