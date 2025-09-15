package Problems;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {        
        s = s.toLowerCase();
        StringBuilder strBldr = new StringBuilder();

        for(int i = 0;  i < s.length();  i++) {
            if((s.charAt(i) >= 97 && s.charAt(i) <= 122) || ((s.charAt(i) >= 48 && s.charAt(i) <= 57))) {
                strBldr.append(s.charAt(i));
            }
        }
        String word = strBldr.toString();
        String reversed = strBldr.reverse().toString();
        
        return word.equals(reversed);
    }
}
