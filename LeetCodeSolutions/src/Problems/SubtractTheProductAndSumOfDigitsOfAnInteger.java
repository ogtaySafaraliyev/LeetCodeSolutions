package Problems;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
	public int subtractProductAndSum(int n) {
        int productOfDigits = 1;
        int sum = 0;
        
        while(n > 0) {
            int digit = n % 10;;
            productOfDigits *= digit;
            sum += digit;

            n /= 10;            
        }
        return productOfDigits - sum;
    }
}
