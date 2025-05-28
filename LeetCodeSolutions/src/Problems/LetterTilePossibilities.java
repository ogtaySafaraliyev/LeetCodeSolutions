package Problems;

import java.util.*;

public class LetterTilePossibilities {
	public int numTilePossibilities(String tiles) {
        Set<String> results = new HashSet<>();
        char[] chars = tiles.toCharArray();
        Arrays.sort(chars); // required to generate for repeated letters
        permute(chars, new boolean[chars.length], new StringBuilder(), results);
        return results.size();
    }

    private void permute(char[] chars, boolean[] used, StringBuilder sb, Set<String> results) {
        for (int i = 0; i < chars.length; i++) {
            if (used[i])
                continue;
            // Skip duplicates
            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1])
                continue;
            sb.append(chars[i]);
            results.add(sb.toString());
            used[i] = true;
            permute(chars, used, sb, results);
            used[i] = false;
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    
    // public int numTilePossibilities(String tiles) {
    //     int[] freq = new int[26];

    //     for (char c : tiles.toCharArray()) {
    //         freq[c - 'A']++;
    //     }

    //     return backtrack(freq);
    // }

    // private int backtrack(int[] freq) {
    //     int count = 0;

    //     for (int i = 0; i < 26; i++) {
    //         if (freq[i] > 0) {
    //             count++;

    //             freq[i]--;
    //             count += backtrack(freq);

    //             freq[i]++; // Backtrack 
    //         }
    //     }

    //     return count;
    // }
}
