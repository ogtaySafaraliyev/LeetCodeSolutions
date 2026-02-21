package Problems;

public class PrimeNumberOfSetBitsInBinaryRepresentation {
	public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i = left; i <= right; i++) {
            int countOfOnes = Integer.bitCount(i);
            if(isPrime(countOfOnes)) {
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(int number) {
        if(number < 2) return false;

        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) return false;
        }
        return true;
    }
}
