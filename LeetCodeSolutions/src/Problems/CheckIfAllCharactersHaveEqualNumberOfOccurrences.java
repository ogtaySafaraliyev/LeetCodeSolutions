package Problems;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public boolean areOccurrencesEqual(String s) {
        int[] count = new int[26];

        for(char ch: s.toCharArray()) {
            count[ch - 'a']++;
        }
        boolean isYeah = true;

        for(int i=0; i<count.length;  i++) {
            for(int j=i+1;  j<count.length;  j++) {
                if(count[i] != count[j] && count[i] != 0 && count[j] != 0) {
                    isYeah = false;
                    break;
                }
            }
        }
        return isYeah;
    }
}
