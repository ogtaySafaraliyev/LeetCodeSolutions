package problems2;
import java.util.*;

public class WordsWithinTwoEditsOfDictionary {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> list = new ArrayList<>();

        int wordLen = queries[0].length();

        for(String query: queries) {
            for(String word: dictionary) {
                int countOfDiff = 0;

                for(int i = 0; i < wordLen; i++) {
                    if(word.charAt(i) != query.charAt(i)) {
                        countOfDiff++;
                    }
                }

                if(countOfDiff <= 2) {
                    list.add(query);
                    break;
                }
            }
        }
        return list;
    }
}
