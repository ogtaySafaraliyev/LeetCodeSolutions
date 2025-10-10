package Problems;

public class MaximumNumberOfWordsFoundInSentences {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String sentence: sentences) {
            String[] words = sentence.split(" ");
            max = Math.max(words.length, max);
        }
        return max;
    }
}
