package Problems;
import java.util.*;

public class FindAndReplacePattern {
	public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ansList = new ArrayList<>();

        for(String word: words) {
            if(matches(word, pattern)) {
                ansList.add(word);
            }
        }

        return ansList;
    }

    private boolean matches(String word, String pattern) {
        Map<Character, Character> wordToPattern = new HashMap<>();
        Map<Character, Character> patternToWord = new HashMap<>();

        if (word.length() != pattern.length()) {
            return false;
        }

        for (int i = 0; i < word.length(); i++) {
            char wordLetter = word.charAt(i);
            char patternLetter = pattern.charAt(i);

            if (wordToPattern.containsKey(wordLetter)) {
                if (wordToPattern.get(wordLetter) != patternLetter) {
                    return false;
                }
            } else {
                wordToPattern.put(wordLetter, patternLetter);
            }

            if (patternToWord.containsKey(patternLetter)) {
                if (patternToWord.get(patternLetter) != wordLetter) {
                    return false;
                }
            } else {
                patternToWord.put(patternLetter, wordLetter);
            }
        }
        return true;
    }
}
