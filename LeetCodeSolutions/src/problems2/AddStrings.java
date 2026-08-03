package problems2;
import java.util.*;

public class AddStrings {
    public String addStrings(String num1, String num2) {
        Deque<Integer> firstNum = new ArrayDeque<>();
        Deque<Integer> secondNum = new ArrayDeque<>();

        for(int i = 0; i < num1.length(); i++) {            
            int digit = num1.charAt(i) - '0';
            firstNum.push(digit);            
        }

        for(int i = 0; i < num2.length(); i++) {
            int digit = num2.charAt(i) - '0';
            secondNum.push(digit);            
        }

        StringBuilder sb = new StringBuilder();
        int carry = 0;

        while(!firstNum.isEmpty() || !secondNum.isEmpty() || carry != 0) {
            int x = firstNum.isEmpty() ? 0 : firstNum.pop();
            int y = secondNum.isEmpty() ? 0 : secondNum.pop();
            int sum = x + y + carry;
            carry = sum / 10;

            sb.append(sum % 10);            
        }
        return sb.reverse().toString();
    }
}
