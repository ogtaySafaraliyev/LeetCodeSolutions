package Problems;

public class PalindromeNumberSolution {
	public boolean isPalindrome(int x) {

        int orgnlNum = x;
        int reverse = 0;
        while(x > 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }

        if(reverse == orgnlNum) 
        return true;

        return false;        
    }
}
