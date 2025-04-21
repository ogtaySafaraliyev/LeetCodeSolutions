package Problems;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> ansList = new ArrayList<String>();

        if(digits.length() == 0) {
            return ansList;
        } 
        
        ansList.add("");

        String[] digitsToLetters = new String[] {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        for(char digit: digits.toCharArray()) {
            String lettersOfNumb = digitsToLetters[digit - '2'];

            List<String> temp = new ArrayList<String>();

            for(String combination: ansList) {
                for(char letter: lettersOfNumb.toCharArray()) {
                    temp.add(combination + letter);
                }
            }
            ansList = temp;

        }
        return ansList;

    }

}
