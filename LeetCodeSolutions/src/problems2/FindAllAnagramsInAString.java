package problems2;
import java.util.*;

public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length()) {
            return ans;
        }

        int[] freq = new int[26];

        for (char ch : p.toCharArray()) {
            freq[ch - 'a']++;
        }

        int i = 0;
        int remaining = p.length();

        for (int j = 0; j < s.length(); j++) {

            if (freq[s.charAt(j) - 'a']-- > 0) {
                remaining--;
            }

            while (remaining == 0) {

                if (j - i + 1 == p.length()) {
                    ans.add(i);
                }

                if (++freq[s.charAt(i) - 'a'] > 0) {
                    remaining++;
                }

                i++;
            }
        }

        return ans;
    }
}
