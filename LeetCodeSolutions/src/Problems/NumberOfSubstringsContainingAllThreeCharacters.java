package Problems;

public class NumberOfSubstringsContainingAllThreeCharacters {
    // public int numberOfSubstrings(String s) {
    //     int[] freq = new int[3]; // index 0 = 'a', 1 = 'b', 2 = 'c'
    //     int left = 0;
    //     int count = 0;

    //     for (int right = 0; right < s.length(); right++) {
    //         freq[s.charAt(right) - 'a']++;

    //         while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
    //             count += s.length() - right;
    //             freq[s.charAt(left) - 'a']--;
    //             left++;
    //         }
    //     }
    //     return count;
    // }

    public int numberOfSubstrings(String s) {
        int[] latestPosition = new int[] { -1, -1, -1 };       
        int answer = 0;
        
        for (int i = 0; i < s.length(); ++i) {
            char currentChar = s.charAt(i);
            
            latestPosition[currentChar - 'a'] = i;
            
            int minPosition = Math.min(latestPosition[0], Math.min(latestPosition[1], latestPosition[2]));
            answer += minPosition + 1;
        }

        return answer;
    }

}
