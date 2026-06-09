package problems2;

public class ReverseWordsWithSameVowelCount {
    public String reverseWords(String s) {
        String[] words = s.split(" ");

        int firstVowelCount = findVowelCount(words[0]);

        for(int i = 1; i < words.length; i++) {
            int currentVowelCount = findVowelCount(words[i]);
            if(firstVowelCount == currentVowelCount) {
                String reversedWord = reverseWord(words[i]);
                words[i] = reversedWord;
            }
        }
        return String.join(" ", words);

    }

    private int findVowelCount(String word) {
        int count = 0;
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    private String reverseWord(String word) {
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString();
    }
}
