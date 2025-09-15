package Problems;

public class MaximumNumberOfWordsYouCanType {
	public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        String[] chArr = brokenLetters.split("");
        int count = 0;

        if(brokenLetters.isEmpty()) {
            return words.length;
        }

        for(String word: words) {
            for(int i = 0;  i < chArr.length;  i++) {
                if(word.contains(chArr[i])) {
                    count++;
                    break;    
                }                
            }
        }
        return words.length - count;        
    }
}
