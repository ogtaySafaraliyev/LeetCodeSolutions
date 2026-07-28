package problems2;

public class SmallestPalindromicRearrangementI {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];

        for(char ch: s.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder half = new StringBuilder();
        char mid = 0;
        for(int i = 0; i < 26; i++) {
            if(freq[i] % 2 == 1) {
                mid = (char)(i + 'a');
            }

            for(int j = 0; j < freq[i] / 2; j++) {
                half.append((char)(i + 'a'));
            }
        }

        StringBuilder ans = new StringBuilder(half);
        if(s.length() % 2 == 1) ans.append(mid);

        return ans.append(half.reverse()).toString();
    }
}
