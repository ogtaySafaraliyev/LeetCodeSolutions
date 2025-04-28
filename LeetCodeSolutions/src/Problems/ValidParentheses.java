package Problems;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();  
        char[] chArr = s.toCharArray();     

        for (int i = 0; i < s.length(); i++) {            

            if (chArr[i] == '(' || chArr[i] == '[' || chArr[i] == '{') {
                stack.push(chArr[i]);
                
            } else if (chArr[i] == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (chArr[i] == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (chArr[i] == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
            else {
                return false;
            }
        }

        return stack.isEmpty() ? true : false;
    }
}
