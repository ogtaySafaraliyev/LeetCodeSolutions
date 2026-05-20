package problems2;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        int currentVowelCount = 0;
        for(int i = 0; i < k; i++) {
            if(isVowel(s.charAt(i))) {
                currentVowelCount++;
            }
        }

        int maxVowelCount = currentVowelCount;

        for(int i = k; i < s.length(); i++) {
            if(isVowel(s.charAt(i))) {
                currentVowelCount++;
            }
            if(isVowel(s.charAt(i - k))) {
                currentVowelCount--;
            }

            maxVowelCount = Math.max(currentVowelCount, maxVowelCount);
        }
        return maxVowelCount;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o';
    }
}
