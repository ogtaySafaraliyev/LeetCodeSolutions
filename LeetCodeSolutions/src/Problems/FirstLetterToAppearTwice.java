package Problems;
import java.util.*;

public class FirstLetterToAppearTwice {
    public char repeatedCharacter(String s) {
        HashMap<Character, Integer> hshMp = new HashMap<>();
        
        for(char ch: s.toCharArray()) {
            hshMp.put(ch, hshMp.getOrDefault(ch, 0) + 1);

            if(hshMp.get(ch) == 2) {
                return ch;
            }    
        }

        return ' ';        
    }
}
