package problems3;

public class ConstructUniformParityArrayII {
	public boolean uniformArray(int[] nums1) {
        final int inf = Integer.MAX_VALUE;
        int oddCount = 0;

        int minOdd = inf;
        for(int num: nums1) {
            if(num % 2 == 1) {
                minOdd = Math.min(num, minOdd);
            }            
        }

        for(int num: nums1) {
            if(num % 2 == 0 && inf != minOdd && minOdd > num) {
                return false;
            }
        }
        return true;        
    }
}
