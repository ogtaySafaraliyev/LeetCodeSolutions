package problems3;
import java.util.*;

public class HIndex {
    public int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);
        
        for(int h = n; h > 0; h--) {
            if(citations[n-h] >= h) {
                return h;
            }
        }
        return 0;
    }
}
