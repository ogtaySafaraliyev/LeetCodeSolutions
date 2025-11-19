package Problems;
import java.util.*;

public class CheckIfWordIsValidAfterSubstitutions {
    // public boolean isValid(String s) {
    //     int len = s.length();
    //     if(len % 3 != 0) {
    //         return false;
    //     }

    //     StringBuilder stack = new StringBuilder();
    //     for(char ch: s.toCharArray()) {
    //         stack.append(ch);
    //         int l = stack.length();

    //         if(l >= 3) {
    //             String lastThreeChars = stack.substring(l - 3);
    //             if(lastThreeChars.equals("abc")) {
    //                 stack.delete(l - 3, l);
    //             }
    //         }
    //     }

    //     return stack.length() == 0;
    // }

    // public boolean isValid(String s) {
    //     Stack<Character> stack = new Stack<>();
        
    //     for(char ch: s.toCharArray()) {
    //         if(ch == 'c') {
    //             if(stack.size() < 2) return false;
    //             char top1 = stack.pop();
    //             char top2 = stack.pop();
    //             if(top1 != 'b' || top2 != 'a') return false;
    //         }

    //         else stack.push(ch);
    //     }
    //     return stack.isEmpty();
    // }

    public boolean isValid(String s) {
        Deque<Character> arrDeque = new ArrayDeque<>();

        for(char ch: s.toCharArray()) {
            if(ch == 'c') {
                if(arrDeque.size() < 2) return false;
                char top1 = arrDeque.removeLast();
                char top2 = arrDeque.removeLast();
                if(top1 != 'b' || top2 != 'a') return false;
            }
            else arrDeque.offer(ch);
        }

        return arrDeque.isEmpty();
    }
}
