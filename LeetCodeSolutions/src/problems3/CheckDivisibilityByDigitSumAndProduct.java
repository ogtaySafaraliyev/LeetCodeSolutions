package problems3;

public class CheckDivisibilityByDigitSumAndProduct {
	public boolean checkDivisibility(int n) {
        int orgnl = n;
        int sum = 0;
        int multiply = 1;

        while(n > 0) {
            int digit = n % 10;
            sum += digit;
            multiply *= digit;
            n /= 10;
        }

        return orgnl % (sum + multiply) == 0;
    }
}
