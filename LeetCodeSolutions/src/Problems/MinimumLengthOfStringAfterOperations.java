package Problems;

public class MinimumLengthOfStringAfterOperations {
    public int minimumLength(String s) {
        int[] freq = new int[26];

        for(char ch: s.toCharArray()) {
            freq[ch - 'a']++;
        }
        int ans = 0;

        for(int count: freq) {
            if(count > 0) {
                ans += ((count & 1) == 1) ? 1 : 2;
            }
        }
        return ans;
    }
}
