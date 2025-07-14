package Problems;

import java.util.*;

public class BuildAnArrayWithStackOperations {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int targetIndex = 0;

        for(int i=1; i <= n && targetIndex < target.length;  i++) {
            stack.push(i);
            list.add("Push");

            if(target[targetIndex] == i) {
                targetIndex++;
            }
            else {
                stack.pop();
                list.add("Pop");
            }
        }
        return list;
    }
}
