package Problems;

import java.util.*;

public class DailyTemperatures {
	// with Stack    
    // public int[] dailyTemperatures(int[] temperatures) {
    //     int[] ans = new int[temperatures.length];
    //     Stack<Integer> stack = new Stack<Integer>();

    //     for (int i = 0; i < temperatures.length; i++) {
    //         while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
    //             int preIndex = stack.pop();
    //             ans[preIndex] = i - preIndex;
    //         }
    //         stack.push(i);
    //     }
    //     return ans;
    // }
// with ArrayDeque
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<Integer>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int preIndex = stack.pop();
                ans[preIndex] = i - preIndex;
            }
            stack.push(i);
        }
        return ans;
    }
}
