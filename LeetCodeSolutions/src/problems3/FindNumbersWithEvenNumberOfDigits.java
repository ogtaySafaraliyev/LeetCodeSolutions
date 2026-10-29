package problems3;

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int num: nums) {
            if(countOfDigits(num) % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }

    private int countOfDigits(int num) {
        int count = 0;
        while(num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
