package problems2;
import java.util.*;

public class DetermineIfTwoStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();

        for (char ch : word1.toCharArray()) {
            freq1.put(ch, freq1.getOrDefault(ch, 0) + 1);
        }

        for (char ch : word2.toCharArray()) {
            freq2.put(ch, freq2.getOrDefault(ch, 0) + 1);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>(); 

        for(int num: freq1.values()) {
            list1.add(num);
        }
        
        for(int num: freq2.values()) {
            list2.add(num);
        }       

        Collections.sort(list1);
        Collections.sort(list2);

        return freq1.keySet().equals(freq2.keySet()) && list1.equals(list2);
    }
}
