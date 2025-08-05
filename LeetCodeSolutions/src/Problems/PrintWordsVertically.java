package Problems;
import java.util.*;

public class PrintWordsVertically {
    public List<String> printVertically(String s) {
        String[] words = s.split(" ");
        List<String> list = new ArrayList<>();

        int maxLength = 0;
        for(String word: words) {
            maxLength = Math.max(word.length(), maxLength);
        }

        for(int i = 0;  i < maxLength;  i++) {

            StringBuilder currentSameLines = new StringBuilder();
            for(String word: words) {
                currentSameLines.append(i < word.length() ? word.charAt(i) : ' ');
            }

            while(currentSameLines.length() > 0    &&    currentSameLines.charAt(currentSameLines.length() - 1) == ' ') {
                currentSameLines.deleteCharAt(currentSameLines.length() - 1);
            }

            list.add(currentSameLines.toString());
        }
        return list;
    }
}
