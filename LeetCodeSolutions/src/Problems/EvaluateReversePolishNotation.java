package Problems;
import java.util.*;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String token: tokens) {            

            if(!token.equals("+") && !token.equals("*") && !token.equals("/") && !token.equals("-")) {
                int tkn = Integer.valueOf(token);
                stack.push(tkn);
            }

            else if(token.equals("+")) {
                int last = stack.pop();
                int previous = stack.pop();
                int sum = last + previous;
                stack.push(sum);
            }

            else if(token.equals("*")) {
                int last = stack.pop();
                int previous = stack.pop();
                int multiply = previous * last;
                stack.push(multiply);
            }

            else if(token.equals("-")) {
                int last = stack.pop();
                int previous = stack.pop();
                int substract = previous - last;
                stack.push(substract);
            }

            else if(token.equals("/")) {
                int last = stack.pop();
                int previous = stack.pop();
                int divide = previous / last;
                stack.push(divide);
            }
            
        }
        return stack.pop();        
    }
}
