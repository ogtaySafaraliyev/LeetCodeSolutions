package Problems;
import java.util.*;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hshMap = new HashMap<>();

        for(char ch: s.toCharArray()) {
            hshMap.put(ch, hshMap.getOrDefault(ch, 0) + 1);
        }

        for(char ch: t.toCharArray()) {
            hshMap.put(ch, hshMap.getOrDefault(ch, 0) - 1);
        }
        boolean isYeah = true;

        for(var pair: hshMap.entrySet()) {
            if(pair.getValue() != 0) {                
                isYeah = false;
            }
        }
        return isYeah;
    }

    // public boolean isAnagram(String s, String t) {
    //     int[] freq = new int[26];

    //     for(char ch: s.toCharArray()) {
    //         freq[ch - 'a']++;
    //     }

    //     for(char ch: t.toCharArray()) {
    //         freq[ch - 'a']--;
    //     }

    //     boolean isYeah = true;
        
    //     for(int i: freq) {
    //         if(i != 0) {
    //             isYeah = false;
    //             break;
    //         }
    //     }
    //     return isYeah;
    // }
}
