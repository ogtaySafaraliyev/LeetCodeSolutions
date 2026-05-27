package problems2;
import java.util.*;

public class CountTheNumberOfSpecialCharactersII {
    public int numberOfSpecialChars(String word) {
        int[] lowerPos = new int[26];
        int[] upperPos = new int[26];

        Arrays.fill(lowerPos, -1);
        Arrays.fill(upperPos, -1);

        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if(ch >= 'a' && ch <= 'z') {
                lowerPos[ch - 'a'] = i;
            }
            else {
                if(upperPos[ch - 'A'] == -1) {
                    upperPos[ch - 'A'] = i;
                }
            }
        }

        int count = 0;
        for(int i = 0; i < 26; i++) {
            if(lowerPos[i] != -1 && upperPos[i] != -1 && lowerPos[i] < upperPos[i]) {
                count++;
            }
        }
        return count;
    }
}
