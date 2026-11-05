package problems3;
import java.util.*;

public class FindTheDistanceValueBetweenTwoArrays {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;

        for(int i = 0; i < arr1.length; i++) {
            boolean valid = true;
            int left = 0;
            int right = arr2.length - 1;
            while(left <= right) {
                int mid = (left + right) / 2;
                if(Math.abs(arr2[mid] - arr1[i]) <= d) {
                    valid = false;
                    break;
                }
                else if(arr2[mid] < arr1[i]) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
            if(valid) {
                count++;
            }
        }
        return count;
    }
}
