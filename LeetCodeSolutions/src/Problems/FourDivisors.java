package Problems;

public class FourDivisors {
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;       

        for(int num: nums) {
            totalSum += helperMethod(num);
        }

        return totalSum;
    }

    private int helperMethod(int num) {
        int sum = num + 1;
        int count = 2;

        for(int i = 2; i <= num / i; i++) {
            if(num % i == 0) {
                sum += i;
                count++;

                if(i * i != num) {
                    sum += num / i;
                    count++;
                }
            }
        }
        return (count == 4) ? sum : 0;
    }
}
