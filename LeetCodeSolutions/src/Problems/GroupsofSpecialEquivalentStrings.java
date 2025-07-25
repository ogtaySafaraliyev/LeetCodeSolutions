package Problems;
import java.util.*;

public class GroupsofSpecialEquivalentStrings {
    public int numSpecialEquivGroups(String[] words) {
        Set<String> hshSet = new HashSet<>();
        for(String word: words) {
            hshSet.add(transform(word));
        }
        return hshSet.size();
    }

    private String transform(String word) {
        List<Character> evenChars = new ArrayList<>();
        List<Character> oddChars = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            if ((i & 1) == 1) {
                oddChars.add(word.charAt(i));
            } else {
                evenChars.add(word.charAt(i));
            }
        }

        Collections.sort(evenChars);
        Collections.sort(oddChars);

        StringBuilder strBldr = new StringBuilder();

        for (char ch : evenChars) {
            strBldr.append(ch);
        }
        for (char ch : oddChars) {
            strBldr.append(ch);
        }

        return strBldr.toString();
    }
}
