package problems3;
import java.util.*;

public class ScoreOfParentheses {
	// public int scoreOfParentheses(String s) {
    //     int depth = 0;
    //     int ans = 0;

    //     for (int i = 0; i < s.length(); i++) {
    //         if (s.charAt(i) == '(') {
    //             depth++;
    //         } else {
    //             depth--;
    //             if (s.charAt(i - 1) == '(') {
    //                 ans += 1 << depth;
    //             }
    //         }
    //     }
    //     return ans;
    // }

    public int scoreOfParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0); // score of the current level

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(0); // start a new level
            } else {
                int inner = stack.pop(); // score inside this pair
                int val = Math.max(2 * inner, 1); // () = 1, (A) = 2*A
                stack.push(stack.pop() + val); // add to the parent level
            }
        }
        return stack.pop();
    }
}
