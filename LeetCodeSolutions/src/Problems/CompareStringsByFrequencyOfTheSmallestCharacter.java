package Problems;

import java.util.*;

public class CompareStringsByFrequencyOfTheSmallestCharacter {
	public int[] numSmallerByFrequency(String[] queries, String[] words) {
        List<Integer> list = new ArrayList<>();        
        for(int i = 0;  i<queries.length;  i++) {
            int smallestFreq = smallestCharFreq(queries[i]);
            int count = 0;
            for(int j = 0;  j<words.length;  j++) {
                if(smallestFreq < smallestCharFreq(words[j])) {
                    count++;
                }
            }
            list.add(count);
        }
        int[] arr = new int[list.size()];

        int i = 0;
        for(int num: list) {
            arr[i++] = num;
        }
        return arr;
    }

    public int smallestCharFreq(String str) {
        char[] chArr = str.toCharArray();
        Arrays.sort(chArr);

        int count = 0;
        for(char ch: chArr) {
            if(ch == chArr[0]) {
                count++;
            }
            else {
                break;
            }
        }
        return count;
    }
}
