package Problems;
import java.util.*;

public class FindFirstPalindromicStringInTheArray {
    // public String firstPalindrome(String[] words) {
    //     ArrayList<String> list = new ArrayList<>();

    //     for(String word: words) {
    //         if(isPalindrome(word)) {
    //             list.add(word);
    //         }
    //     }

    //     if(list.isEmpty()) {
    //         return "";
    //     }
        
    //     return list.get(0);
    // }

    // public boolean isPalindrome(String word) {
    //     StringBuilder strBldr = new StringBuilder(word);
    //     strBldr.reverse();
    //     if(strBldr.toString().equals(word)) {
    //         return true;
    //     }
    //     return false;
    // }


    public String firstPalindrome(String[] words) {
        for(String word: words) {
            if(isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }

    private boolean isPalindrome(String word) {             
        int left = 0;
        int right = word.length() - 1;
        while(left < right) {
            if(word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }   

}
