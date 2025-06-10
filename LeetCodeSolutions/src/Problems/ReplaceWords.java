package Problems;

import java.util.*;

public class ReplaceWords {
    public String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder strBldr = new StringBuilder();
        String[] words = sentence.split(" ");

        for(String word: words) {
            for(String dict: dictionary) {
                if(word.startsWith(dict)) {
                    word = dict;
                }
                
            }
            strBldr.append(word).append(" ");
            
        }
        
        return strBldr.toString().trim();
    }
}
