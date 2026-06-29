package problems2;

public class NumberOfStringsThatAppearAsSubstringsInWord {
    public int numOfStrings(String[] patterns, String word) {
        int ans = 0;
        for(String piece: patterns) {
            if(word.contains(piece)) {
                ans++;
            }
        }
        return ans;
    }
}
