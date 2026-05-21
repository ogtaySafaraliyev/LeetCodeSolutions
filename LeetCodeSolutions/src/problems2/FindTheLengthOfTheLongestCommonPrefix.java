package problems2;
import java.util.*;

public class FindTheLengthOfTheLongestCommonPrefix {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();

        for(int num: arr1) {
            while(num > 0) {
                set.add(num);
            
                num /= 10;
            }
        }

        int maxLengthOfprefix = 0;

        for(int num: arr2) {
            while(num > 0) {
                if(set.contains(num)) {
                    int currentNumLen = String.valueOf(num).length();
                    maxLengthOfprefix = Math.max(currentNumLen, maxLengthOfprefix);
                    break;
                }
                num /= 10;
            }
        }
        return maxLengthOfprefix;
    }
}
