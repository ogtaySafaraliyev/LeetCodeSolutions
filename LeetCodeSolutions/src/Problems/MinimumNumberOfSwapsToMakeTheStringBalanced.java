package Problems;

import java.util.*;

public class MinimumNumberOfSwapsToMakeTheStringBalanced {
    // public int minSwaps(String s) {
    //     int balance = 0; // Current balance
    //     int maxImbalance = 0; // Max negative balance

    //     for (char ch : s.toCharArray()) {
    //         if (ch == '[') {
    //             balance++;
    //         } else {
    //             balance--;
    //         }

    //         if (balance < 0) {
    //             maxImbalance = Math.max(maxImbalance, -balance);
    //         }
    //     }

    //     // Each swap fixes one mismatch (not two)
    //     return (maxImbalance + 1) / 2;
    // }

    public int minSwaps(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '[') {
                stack.push(ch);
            } else {
                if (!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop(); // matched pair
                } else {
                    stack.push(ch); // unmatched ]
                }
            }
        }

        // stack now contains only unmatched brackets: some ] followed by some [
        int unmatched = stack.size() / 2;

        // each swap fixes one pair
        return (unmatched + 1) / 2;
    }

    // public int minSwaps(String s) {
    //     Stack<Character> st = new Stack<>();
    //     for (char ch : s.toCharArray()) {
    //         if (ch == '[') {
    //             st.push(ch);
    //         } else if (!st.isEmpty()) {
    //             st.pop();
    //         }

    //     }
    //     return (st.size() + 1) / 2;
    // }

    // public int minSwaps(String s) {
    //     int open = 0; // acts like the size of the stack

    //     for (char ch : s.toCharArray()) {
    //         if (ch == '[') {
    //             open++;
    //         } else if (open > 0) {
    //             open--;
    //         }
    //     }

    //     return (open + 1) / 2;
    // }
}
