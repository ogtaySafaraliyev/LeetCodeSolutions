package problems2;
import java.util.*;

public class SortVowelsByFrequency {
    public String sortVowels(String s) {
        Map<Character, Integer> freq = new LinkedHashMap<>();       

        for(char ch: s.toCharArray()) {
            if(isVowel(ch)) {
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }
        }

        List<Character> list = new ArrayList<>(freq.keySet());
        list.sort(Comparator.comparingInt(freq::get).reversed());

        Deque<Character> queue = new ArrayDeque<>();     
        for (char ch : list) {
            for (int i = 0; i < freq.get(ch); i++) {
                queue.offer(ch);
            }
        }   
        
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(isVowel(ch)) {
                sb.append(queue.poll());
            }
            else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    private boolean isVowel(char ch) {
        return (ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u');
    }
}
