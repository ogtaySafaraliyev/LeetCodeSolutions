package Problems;

public class StrictlyPalindromicNumber {
    // public boolean isStrictlyPalindromic(int n) {
    //     return false;
    // }    

    private String getRepresentation(int n, int base) {
        String ans = "";
        while (n > 0) {
            int rem = (n % base);
            n /= base;
            ans = String.valueOf(rem) + ans;
        }

        return ans;
    }

    private boolean isPalindrome(String s) {
        int leftInd = 0;
        int rightInd = s.length() - 1;
        while (leftInd < rightInd) {
            if (s.charAt(leftInd++) != s.charAt(rightInd--)) {
                return false;
            }
        }

        return true;
    }

    public boolean isStrictlyPalindromic(int n) {
        for (int base = 2 ; base <= (n - 2) ; base++) {
            String cur = getRepresentation(n, base);
            if (!isPalindrome(cur)) {
                return false;
            }
        }

        return true;
    }
}
