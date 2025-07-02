package Problems;

import java.util.*;

public class MinimumNumberOfOperationsToReinitializeAPermutation {
    public int reinitializePermutation(int n) {
        int count = 0;

        int[] original = new int[n];        
        for(int i=0;  i<n;  i++) {
            original[i] = i;
        }
        
        int[] perm = Arrays.copyOf(original, n);
        int[] arr = new int[n];

        while(true) {
            for(int i=0;  i<n;  i++) {
                if((i & 1) == 1) {
                    arr[i] = perm[n / 2 + (i - 1) / 2];
                }
                else{
                    arr[i] = perm[i / 2];
                }                
            }
            count++;
            perm = Arrays.copyOf(arr, n);

            if(Arrays.equals(original, perm)) {
                break;
            }
        }
        return count;        
    }
}
