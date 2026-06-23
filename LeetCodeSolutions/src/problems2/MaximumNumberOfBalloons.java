package problems2;
import java.util.*;

public class MaximumNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        String word = "balloon";
        Map<Character,Integer> freqWord  = new HashMap<>();
        
        for(char ch: word.toCharArray()) {
            freqWord.put(ch, freqWord.getOrDefault(ch, 0) + 1);
        }

        Map<Character,Integer> freqText  = new HashMap<>();
        
        for(char ch: text.toCharArray()) {
            freqText.put(ch, freqText.getOrDefault(ch, 0) + 1);
        }

        int ans = Integer.MAX_VALUE;

        for(var entry: freqWord.entrySet()) {
            char key = entry.getKey();
            int val = entry.getValue();

            int textVal = freqText.getOrDefault(key, 0);

            ans = Math.min(ans, textVal / val);
        }
        return ans;
    }
}
