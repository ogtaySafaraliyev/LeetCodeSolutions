package Problems;

public class CountTheDigitsThatDivideANumber {
	public int countDigits(int num) {
		int orgnlNum = num;
		int count = 0;

		while (num > 0) {
			int digit = num % 10;
			num /= 10;

			if (orgnlNum % digit == 0) {
				count++;
			}
		}
		return count;
	}
}
