package problems3;

public class CalculateDigitSumOfAString {
	public String digitSum(String s, int k) {    

        while(s.length() > k) {
            
            StringBuilder next = new StringBuilder();

            for (int i = 0; i < s.length(); i += k) {
                int end = Math.min(i + k, s.length());
                next.append(sumOfDigits(s.substring(i, end)));
            }
            s = next.toString();
        }
        return s;
    }

    private int sumOfDigits(String piece) {
        int sum = 0;
        for(char ch: piece.toCharArray()) {
            int digit = (int)(ch - '0');
            sum += digit;
        }
        return sum;
    }
}
