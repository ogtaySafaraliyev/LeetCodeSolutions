package problems2;

public class FindMaximumNumberOfStringPairs {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for(int i = 0; i < words.length; i++) {
            for(int j = i + 1; j < words.length; j++) {
                if(isPair(words[i], words[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isPair(String s, String t) {
        int[] freq = new int[26];

        for(char ch: s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for(char ch: t.toCharArray()) {
            freq[ch - 'a']--;
        }

        boolean isYeah = true;
        
        for(int i: freq) {
            if(i != 0) {
                isYeah = false;
                break;
            }
        }
        return isYeah;
    }
}
