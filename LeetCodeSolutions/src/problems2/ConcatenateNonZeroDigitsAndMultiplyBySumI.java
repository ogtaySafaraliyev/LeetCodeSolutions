package problems2;

public class ConcatenateNonZeroDigitsAndMultiplyBySumI {
    public long sumAndMultiply(int n) {
        long nonZeroDigit = 0;
        int sum = 0;
        int place = 1;

        while(n > 0) {
            int digit = n % 10;
            sum += digit;

            if(digit != 0) {
                nonZeroDigit = (long) digit * place + nonZeroDigit;
                place *= 10; 
            }
                        
            n /= 10;
        }

        return nonZeroDigit * sum;
    }
}
