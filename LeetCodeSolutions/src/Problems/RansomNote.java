package Problems;
import java.util.*;

public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch : magazine.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        boolean isValid = true;
        for (char ch : ransomNote.toCharArray()) {
            if(!freqMap.containsKey(ch) || freqMap.get(ch) == 0) {
                isValid = false;
                break;
            }
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) - 1);
        }
        
        return isValid;
    }

    // public boolean canConstruct(String ransomNote, String magazine) {
    //     int[] countMagzn = new int[26];
    //     int[] countRnsm = new int[26];

    //     for(char ch: magazine.toCharArray()) {
    //         countMagzn[ch - 97]++;
    //     }

    //     for(char ch: ransomNote.toCharArray()) {
    //         countRnsm[ch - 97]++;
    //     }

    //     boolean isValid = true;

    //     for(int i = 0;  i < 26;  i++) {
    //         if(countMagzn[i] < countRnsm[i]) {
    //             isValid = false;
    //             break;
    //         }
    //     }
    //     return isValid;
    // }

}
