package Problems;

public class DivideArrayIntoEqualPairs {
    public boolean divideArray(int[] nums) {
        int[] count = new int[501];

        for(int number: nums) {
            count[number]++;
        }

        boolean isYeah = true;

        for(int i=0;  i<count.length;  i++) {
            if(count[i] % 2 != 0) {
                isYeah = false;
                break;
            }
        }
        return isYeah;
    }
}
