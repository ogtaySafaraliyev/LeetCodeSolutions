package Problems;

import java.util.*;

public class MinimumRemoveToMakeValidParentheses {
    public String minRemoveToMakeValid(String s) {
        char[] chArr = s.toCharArray();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < chArr.length; i++) {
            if(chArr[i] == '(') {
                stack.push(i);
            }

            else if(chArr[i] == ')') {
                if(stack.isEmpty()) {
                    chArr[i] = '$';
                }
                else {
                    stack.pop();
                }
            }
        }

        while(!stack.isEmpty()) {
            chArr[stack.pop()] = '$';
        }

        StringBuilder ans = new StringBuilder();
        for(char ch: chArr) {
            if(ch != '$') {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
