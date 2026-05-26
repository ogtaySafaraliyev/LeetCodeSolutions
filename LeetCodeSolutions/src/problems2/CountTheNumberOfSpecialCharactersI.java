package problems2;
import java.util.*;

public class CountTheNumberOfSpecialCharactersI {
    public int numberOfSpecialChars(String word) {
        Set<Character> hshSet = new HashSet<>();

        for(char ch: word.toCharArray()) {
            hshSet.add(ch);
        }

        int count = 0;
        for(char ch: hshSet) {
            if(hshSet.contains((char)(ch - 32)) && ch >= 'a' && ch <= 'z') {
                count++;
            }
        }
        return count;
    }
}
