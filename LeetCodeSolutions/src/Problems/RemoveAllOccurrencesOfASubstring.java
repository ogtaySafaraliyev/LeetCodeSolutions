package Problems;
import java.util.*;

public class RemoveAllOccurrencesOfASubstring {
    // public String removeOccurrences(String s, String part) {

    //     for(;s.contains(part);) {
    //         s = s.replaceFirst(part, "");
    //     }
    //     return s;
    // }
// 	with Stack DS
    // public String removeOccurrences(String s, String part) {
    //     Stack<Character> stack = new Stack<>();
    //     int partLen = part.length();

    //     for (char c : s.toCharArray()) {
    //         stack.push(c);

    //         // Check if top of stack matches the 'part' string
    //         if (stack.size() >= partLen) {
    //             boolean isMatch = true;
    //             for (int i = 0; i < partLen; i++) {
    //                 if (stack.get(stack.size() - partLen + i) != part.charAt(i)) {
    //                     isMatch = false;
    //                     break;
    //                 }
    //             }

    //             // If match found, pop the last `part.length()` characters
    //             if (isMatch) {
    //                 for (int i = 0; i < partLen; i++) {
    //                     stack.pop();
    //                 }
    //             }
    //         }
    //     }

    //     // Build result from stack
    //     StringBuilder result = new StringBuilder();
    //     for (char ch : stack) {
    //         result.append(ch);
    //     }

    //     return result.toString();
    // }

//	with StringBuilder
    public String removeOccurrences(String s, String part) {
        StringBuilder stack = new StringBuilder();
        int partLen = part.length();

        for (char c : s.toCharArray()) {
            stack.append(c);

            // Check if the end of the stack matches 'part'
            if (stack.length() >= partLen &&
                stack.substring(stack.length() - partLen).equals(part)) {
                stack.delete(stack.length() - partLen, stack.length());
            }
        }

        return stack.toString();
    }
}
