package Problems;
import java.util.*;

public class FirstUniqueCharacterInAString {
    // public int firstUniqChar(String s) {
    //     HashMap<Character, Integer> freq = new HashMap<>();
    //     int index = -1;

    //     for(char ch: s.toCharArray()) {
    //         freq.put(ch, freq.getOrDefault(ch, 0) + 1);
    //     }

    //     for(int i = 0; i < s.length(); i++) {
    //         char ch = s.charAt(i);
    //         if(freq.get(ch) == 1) {
    //             index = i;
    //             break;
    //         }
    //     }
    //     return index;        
    // }
    
    public int firstUniqChar(String s) {
        int[] freq = new int[26]; // frequency array

        // count frequencies
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // find first unique
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (freq[ch - 'a'] == 1) {
                return i;
            }
        }

        return -1; // no unique character
    }
}
