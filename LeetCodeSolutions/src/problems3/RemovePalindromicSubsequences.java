package problems3;

public class RemovePalindromicSubsequences {
	public int removePalindromeSub(String s) {
        if(s.isEmpty()) return 0;
        int count = 1;
        
        for(int i = 0, j = s.length() - 1; i < j; i++, j--) {

            if (s.charAt(i) != s.charAt(j)) {
                count = 2; // not a palindrome
                break;
            }
        }
        return count;
    }
}
