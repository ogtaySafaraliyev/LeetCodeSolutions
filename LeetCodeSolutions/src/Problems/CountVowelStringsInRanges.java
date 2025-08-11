package Problems;

public class CountVowelStringsInRanges {
public int[] vowelStrings(String[] words, int[][] queries) {        
        int[] prefixSum = new int[words.length + 1];

        for(int i = 0;  i < words.length;  i++) {
            prefixSum[i+1] = prefixSum[i] + (rightWord(words[i]) ? 1 : 0);
        }

        int[] ans = new int[queries.length];
        
        for(int i = 0;  i < queries.length;  i++) {            
            int left = queries[i][0];
            int right = queries[i][1];
            
            ans[i] = prefixSum[right + 1] - prefixSum[left];
            
        }
        return ans;
    }

    private boolean rightWord(String word) {
        char ch1 = word.charAt(0);
        char ch2 = word.charAt(word.length() - 1);
        String vowels = "aeiou"; 
    
        return vowels.indexOf(ch1) != -1 && vowels.indexOf(ch2) != -1;
    }
}
