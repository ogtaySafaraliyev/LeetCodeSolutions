package Problems;
import java.util.*;

public class MinimumAddToMakeParenthesesValid {
	public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int ans = 0;
        char[] chArr = s.toCharArray();

        for(int ch: chArr) {
            if(ch == '(') {
                stack.push('(');
            }
            else if(ch == ')') {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
                else {
                    ans++; 
                }
            }
        }
        return ans + stack.size();
    }
}
