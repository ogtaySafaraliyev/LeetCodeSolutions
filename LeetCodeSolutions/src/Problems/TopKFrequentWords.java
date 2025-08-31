package Problems;
import java.util.*;

public class TopKFrequentWords {
	public List<String> topKFrequent(String[] words, int k) {
        //  1. collect elements to hashmap
        //  2. sort due to freq
        
        Map<String, Integer> freqMap = new HashMap<>();

        for(String word: words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(freqMap.entrySet());

        entries.sort((e1, e2) -> {
            int freqCompare = e2.getValue().compareTo(e1.getValue());
            if(freqCompare != 0) {
                return freqCompare;  // higher frequency first
            }

            return e1.getKey().compareTo(e2.getKey());  // lexicographically ascending

        });

        List<String> list = new ArrayList<>();

        for(int i = 0;  i < k && i < entries.size();  i++) {
            list.add(entries.get(i).getKey());
        }

        return list;
    }
}
