package Problems;

public class CountTheNumberOfConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int ansCount = 0;
        for(String word: words) {
            if(helperMethod(word, allowed)) {
                ansCount++;
            }
        }
        return ansCount;
    }

    private boolean helperMethod(String word, String allowed) {
        boolean[] isAllowed = new boolean[26];
        
        for(char ch: allowed.toCharArray()) {
            isAllowed[ch - 'a'] = true;
        }        
        
        for(char ch: word.toCharArray()) {
            if(!isAllowed[ch - 'a']) {
                return false;
            }
        }
        return true;
    }
}
