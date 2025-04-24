package Problems;

public class MaximumOddBinaryNumber {
	public String maximumOddBinaryNumber(String s) {
		char[] arrOfS = s.toCharArray();
		int countOfOnes = 0;

		for (int i = 0; i < s.length(); i++) {
			if (arrOfS[i] == '1') {
				countOfOnes++;
			}
		}
		String ans = "1".repeat(countOfOnes - 1).concat("0".repeat(arrOfS.length - countOfOnes).concat("1"));
		return ans;
	}
}
