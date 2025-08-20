package Problems;
import java.util.*;

public class RemovingStarsFromAString {
    // public String removeStars(String s) {
    //     Stack<Character> stack = new Stack<>();
    //     for(char ch: s.toCharArray()) {
    //         if(ch != '*') {
    //             stack.push(ch);
    //         }

    //         else {
    //             stack.pop();
    //         }
    //     }
    //     StringBuilder ans = new StringBuilder();
    //     for(int i = 0;  i< stack.size();  i++) {
    //         ans.append(stack.get(i));
    //     }
    //     return ans.toString();        
    // }

    public String removeStars(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char ch: s.toCharArray()) {
            if(ch != '*') {
                stack.offer(ch);
            }

            else {
                stack.removeLast();
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()) {
            ans.append(stack.removeFirst());
        }
        return ans.toString();        
    }
}
