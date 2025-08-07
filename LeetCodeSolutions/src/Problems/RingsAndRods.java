package Problems;
import java.util.*;

public class RingsAndRods {
	public int countPoints(String rings) {
        HashMap<Integer, Set<Character>> hshMap = new HashMap<>();

        for(int i = 0, j = 1;  i < rings.length() - 1 && j < rings.length();   i += 2, j += 2) {
            int rod = rings.charAt(j) - 48;
            char color = rings.charAt(i);
            if(!hshMap.containsKey(rod)) {
                hshMap.put(rod, new HashSet<>());
            }
            hshMap.get(rod).add(color);
        }

        int count = 0;

        for(Set<Character> colors: hshMap.values()) {            
            if (colors.contains('R') && colors.contains('B') && colors.contains('G')) {
                count++;
            }
        }
        return count;
            
    }
}
