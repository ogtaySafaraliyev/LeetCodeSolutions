package Problems;
import java.util.*;

public class SplitAStringInBalancedStrings {
    // public int balancedStringSplit(String s) {
    //     int count = 0;
    //     Stack<Character> stack = new Stack<>();
    //     for(char ch: s.toCharArray()) {
    //         if(stack.isEmpty() || stack.peek() == ch) {
    //             stack.push(ch);
    //         }
    //         else {
    //             stack.pop();
    //         }
    //         if(stack.isEmpty()) {
    //             count++;
    //         }            
    //     }
    //     return count;
    // }

    public int balancedStringSplit(String s) {
        int count = 0;
        int countI = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'L') {
                countI++;
            } else {
                countI--;
            }
            if (countI == 0) {
                count++;
            }
        }
        return count;
    }
}
