package problems3;

public class ReverseSubstringsBetweenEachPairOfParentheses {
    public String reverseParentheses(String s) { 
        StringBuilder stack = new StringBuilder();     

        for(char ch: s.toCharArray()) {
            StringBuilder reversedSegment = new StringBuilder();            
            if(ch == ')') {                
                while(stack.charAt(stack.length() - 1) != '(') {
                    reversedSegment.append(stack.charAt(stack.length() - 1));
                    stack.deleteCharAt(stack.length() - 1);
                }
                //deletes '(' 
                stack.deleteCharAt(stack.length() - 1);

                stack.append(reversedSegment);                
            }
            
            else {
                stack.append(ch);
            } 
        }
        return stack.toString();
    }
}
