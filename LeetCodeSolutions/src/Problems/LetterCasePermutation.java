package Problems;
import java.util.*;
public class LetterCasePermutation {
    public List<String> letterCasePermutation(String s) {
        List<String> ansList = new ArrayList<>();
        ansList.add(s);

        for(int i=0; i < s.length();  i++) {
            char ch = s.charAt(i);
            if(Character.isLetter(ch)) {
                int size = ansList.size();
                for(int j=0;  j < size;  j++) {
                    String current = ansList.get(j);
                    char toggled = Character.isLowerCase(ch) ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
                    String next = current.substring(0, i) + toggled + current.substring(i+1);
                    ansList.add(next);
                }
            }
        }
        return ansList;    
    }
}
