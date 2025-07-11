package Problems;

import java.util.*;

public class MaximumNestingDepthOfTheParentheses {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int maxDepth = 0;
        char[] arr = s.toCharArray();
        
        for(char ch: arr) {
            if(ch == '(') {
                stack.push(ch);
                maxDepth = Math.max(maxDepth, stack.size());
            }
            else if(ch == ')') {
                if(!stack.isEmpty()){
                    stack.pop();
                }
                
            }
        }
        return maxDepth;
    }
}
