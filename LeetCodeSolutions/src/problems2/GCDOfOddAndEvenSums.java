package problems2;

public class GCDOfOddAndEvenSums {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        int count = 1;

        for (int i = 1, j = 2; count <= n; i += 2, j += 2) {
            sumOdd += i;
            sumEven += j;
            count++;
        }
        return gcd(sumOdd, sumEven);
    }

    private int gcd(int num1, int num2) {
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
