package problems3;

public class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
        int[] charFreq = new int[128];

        int left = 0;
        int sLen = s.length();
        int maxLength = 0;

        for(int right = 0; right < sLen; right++) {
            
            char currCh = s.charAt(right);
            charFreq[currCh]++;

            while(charFreq[currCh] > 1) {
                charFreq[s.charAt(left)]--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
