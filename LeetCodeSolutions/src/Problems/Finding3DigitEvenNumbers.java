package Problems;
import java.util.*;

public class Finding3DigitEvenNumbers {
    public int[] findEvenNumbers(int[] digits) {
        int[] count = new int[10];

        for(int digit: digits) {
            count[digit]++;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 1;  i <= 9;  i++) {
            for(int j = 0;  j <= 9;  j++) {
                for(int k = 0;  k <= 8;  k += 2) {
                    if(count[i] > 0 
                    && count[j] > (i == j ? 1 : 0)
                    && count[k] > (k == i ? 1 : 0) + (k == j ? 1 : 0)) {
                        list.add(100 * i + 10 * j + k);
                    }
                }
            }
        }

        // int i = 0;
        // int[] arr = new int[list.size()];

        // for(int number: list) {
        //     arr[i++] = number;
        // }
        // return arr;

        return list.stream().mapToInt(Integer :: intValue).toArray();
    }
}
