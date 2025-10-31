package Problems;
import java.util.*;

public class ClearDigits {
    public String clearDigits(String s) {
        Deque<Character> arrDeque = new ArrayDeque<>();

        for(char ch: s.toCharArray()) {
            if(ch >= 'a' && ch <= 'z') {
                arrDeque.offer(ch);
            }

            if(ch >= '0' && ch <= '9') {
                arrDeque.removeLast();
            }            
        }

        StringBuilder strBldr = new StringBuilder();

        while(!arrDeque.isEmpty()) {
            char ch = arrDeque.poll();
            strBldr.append(ch);
        }
        return strBldr.toString();
    }
}
