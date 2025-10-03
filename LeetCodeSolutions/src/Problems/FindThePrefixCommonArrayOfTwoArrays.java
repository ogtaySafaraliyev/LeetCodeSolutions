package Problems;
import java.util.*;

public class FindThePrefixCommonArrayOfTwoArrays {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> hsA = new HashSet<>();
        Set<Integer> hsB = new HashSet<>();
        int[] ansArr = new int[A.length];
        int count = 0;

        for(int i = 0;  i < A.length;  i++) {
            if(A[i] == B[i]) {
                count++;
            }

            else {
                hsA.add(A[i]);
                hsB.add(B[i]);

                if(hsA.contains(B[i])) {
                    count++;
                }
                if(hsB.contains(A[i])) {
                    count++;
                }
            }
            ansArr[i] = count;
        }
        return ansArr;
    }
}
