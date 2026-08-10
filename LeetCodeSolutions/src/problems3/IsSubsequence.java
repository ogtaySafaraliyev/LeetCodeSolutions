package problems3;

public class IsSubsequence {
	public boolean isSubsequence(String s, String t) {
        StringBuilder str = new StringBuilder();
        for(int i = 0, j = 0; i < s.length() && j < t.length();  j++) {
            if(s.charAt(i) == t.charAt(j)) {
                str.append(s.charAt(i));
                i++;
            }
        }
        return str.toString().equals(s);
    }
}
