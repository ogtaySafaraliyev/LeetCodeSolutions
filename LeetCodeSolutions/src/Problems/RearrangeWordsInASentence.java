package Problems;
import java.util.*;

public class RearrangeWordsInASentence {
    public String arrangeWords(String text) {
        String text1 = text.toLowerCase();
        String[] words = text1.split(" ");
        HashMap<String, Integer> hshMap = new HashMap<>();

        for(String word: words) {
            hshMap.put(word, word.length());

        }

        Arrays.sort(words, Comparator.comparingInt(hshMap::get));        

        StringBuilder strBldr = new StringBuilder();        
        for(String word: words) {            
            strBldr.append(word).append(" ");
        }        

        strBldr.replace(0, 1, strBldr.toString().substring(0, 1).toUpperCase());
        return strBldr.toString().trim();
    }
}
