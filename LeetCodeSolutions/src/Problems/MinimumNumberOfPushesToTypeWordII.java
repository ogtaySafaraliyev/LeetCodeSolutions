package Problems;
import java.util.*;

public class MinimumNumberOfPushesToTypeWordII {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for(char letter: word.toCharArray()) {
            freq[letter - 'a']++;
        }
        Arrays.sort(freq);

        int pushes = 0;
        for(int i = 0; i < freq.length; i++) {
            int count = freq[25 - i];
            if(count == 0) {
                break;
            }
            pushes += count * (i / 8 + 1);
        }
        return pushes;
    }
}
