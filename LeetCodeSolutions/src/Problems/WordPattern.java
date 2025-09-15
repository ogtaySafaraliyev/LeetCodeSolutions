package Problems;
import java.util.*;

public class WordPattern {
    // public boolean wordPattern(String pattern, String s) {
    //     char[] charsP = pattern.toCharArray();
    //     String[] words = s.split(" ");

    //     if(words.length != charsP.length) {
    //         return false;
    //     }

    //     Map<Character, String> patternToS = new HashMap<>();
    //     Map<String, Character> sToPattern = new HashMap<>();

    //     for (int i = 0; i < words.length; i++) {
    //         if(patternToS.containsKey(charsP[i])) {
    //             String str = patternToS.get(charsP[i]);
    //             if(!str.equals(words[i])) {
    //                 return false;
    //             }
    //         }

    //         if(sToPattern.containsKey(words[i])) {
    //             char ch = sToPattern.get(words[i]);
    //             if(ch != charsP[i]) {
    //                 return false;
    //             }
    //         }   
            
    //         patternToS.put(charsP[i], words[i]);
    //         sToPattern.put(words[i], charsP[i]);     

    //     }
    //     return true;
    // }


    public boolean wordPattern(String pattern, String s) {
        char[] charsP = pattern.toCharArray();
        String[] words = s.split(" ");

        Map<Character, String> patternToS = new HashMap<>();
        Map<String, Character> sToPattern = new HashMap<>();

        if(words.length != charsP.length) {
            return false;
        }        

        for (int i = 0; i < words.length; i++) {                       
            
            String str = patternToS.putIfAbsent(charsP[i], words[i]);
            Character ch = sToPattern.putIfAbsent(words[i], charsP[i]);  

            if(!words[i].equals(str) && str != null) {
                return false;
            }   

            if(ch != null && charsP[i] != ch) {
                return false;
            }
        }

        return true;
    }
}
