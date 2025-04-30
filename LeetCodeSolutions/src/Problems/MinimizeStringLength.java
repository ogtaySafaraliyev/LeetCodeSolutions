package Problems;

import java.util.HashSet;

public class MinimizeStringLength {
    public int minimizedStringLength(String s) {
        char[] charArr = s.toCharArray();
        HashSet<Character> set = new HashSet<Character>();

        for(char ch: charArr) {
            set.add(ch);
        }
        return set.size();        
    }
}
