package Problems;
import java.util.*;

public class SeparateTheDigitsInAnArray {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            List<Integer> temp = new ArrayList<>();

            while (num > 0) {
                temp.add(num % 10); // take last digit
                num /= 10;
            }

            Collections.reverse(temp); // fix order
            list.addAll(temp);
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
