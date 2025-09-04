package Problems;
import java.util.*;

public class CheckIfAStringCanBreakAnotherString {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();        

        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);

        return canBreak(s1Arr, s2Arr) || canBreak(s2Arr, s1Arr);
        
    }

    private boolean canBreak(char[] s1Arr, char[] s2Arr) {
        int n = s1Arr.length;
        for (int i = 0; i < n; i++) {
            if (s1Arr[i] < s2Arr[i]) {
                return false;
            }
        }
        return true;
    }
}
