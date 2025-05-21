package Problems;

public class FindMostFrequentVowelAndConsonant {
    public int maxFreqSum(String s) {
        int[] frequency = new int[26];

        for(char letter: s.toCharArray()) {
            frequency[letter - 'a']++;
        }

        int maxFreqVowel = 0;
        int maxFreqConson = 0;

        for(int i=0;  i<frequency.length;  i++) {
            char ch = (char) (i + 'a');
            if(isVowel(ch)) {
                maxFreqVowel = Math.max(maxFreqVowel, frequency[i]);
            }
            else {
                maxFreqConson = Math.max(maxFreqConson, frequency[i]);
            }
        }

        return maxFreqConson + maxFreqVowel;

    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
