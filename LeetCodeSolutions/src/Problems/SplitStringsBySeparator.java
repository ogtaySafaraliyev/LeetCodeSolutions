package Problems;
import java.util.*;
//import java.util.regex.Pattern; // Importing the Pattern class for regex operations.

public class SplitStringsBySeparator {
    // public List<String> splitWordsBySeparator(List<String> words, char separator) {
    //     List<String> list = new ArrayList<>();

    //     for(String piece: words) {
    //         String[] wordP = piece.split(Pattern.quote(String.valueOf(separator)));
    //         for(String word: wordP) {
    //             if(!word.isEmpty()) {
    //                 list.add(word);
    //             }

    //         }
    //     }
    //     return list;
    // }

    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();
        
        for(String piece: words) {
            String[] wordP = piece.split("\\" + separator);
            for(String word: wordP) {
                if(!word.isEmpty()) {
                    list.add(word);
                }
                
            }
        }
        return list;
    }
}
