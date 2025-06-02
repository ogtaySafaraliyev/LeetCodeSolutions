package Problems;

import java.util.*;

public class SubstringsOfSizeThreeWithDistinctCharacters {
    public int countGoodSubstrings(String s) {
        // if (s.length() < 3) return 0;
        int count = 0;

        for (int i = 0; i <= s.length() - 3; i++) {
            
            Set<Character> window = new HashSet<>();
            window.add(s.charAt(i));
            window.add(s.charAt(i + 1));
            window.add(s.charAt(i + 2));
            if (window.size() == 3) {
                count++;
            }
        }

        return count;
    }
}
