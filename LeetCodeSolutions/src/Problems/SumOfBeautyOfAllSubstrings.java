package Problems;

public class SumOfBeautyOfAllSubstrings {
	public int beautySum(String s) {
        char[] ch = s.toCharArray();
        int n = ch.length;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < n; j++) {
                sb.append(ch[j]); // build the substring
                sum += beautyOfWord(sb.toString());
            }
        }
        return sum;
    }

    private int beautyOfWord(String word) {
        int[] freq = new int[26];

        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int count: freq) {
            if(count > 0) {
                max = Math.max(count, max);
                min = Math.min(count, min);
            }
            
        }
        return max - min;
    }
}
