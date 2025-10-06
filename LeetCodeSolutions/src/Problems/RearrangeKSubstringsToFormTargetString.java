package Problems;
import java.util.*;

public class RearrangeKSubstringsToFormTargetString {
	public boolean isPossibleToRearrange(String s, String t, int k) {
        String[] sArrs = helperMethod(s, k);
        String[] tArrs = helperMethod(t, k); 
        Arrays.sort(sArrs);
        Arrays.sort(tArrs);
        return Arrays.equals(sArrs, tArrs);
    }

    private String[] helperMethod(String str, int k) {
        String[] arr = new String[k];
        int onePieceLen = str.length() / k;

        for(int i = 0; i < k;  i++) {
            int start = i * onePieceLen;
            int ending = start + onePieceLen;
            arr[i] = str.substring(start, ending);
        }
        return arr;
    }
}
