package problems3;

public class MaximizeSumOfSquaresOfDigits {
	public String maxSumOfSquares(int num, int sum) {
        if(sum > num * 9) return "";

        char[] ans = new char[num];

        for(int i = 0; i < num; i++) {
            int digit = Math.min(sum, 9);
            ans[i] = (char) ('0' + digit);
            sum -= digit;
        }

        return new String(ans);
    }
}
