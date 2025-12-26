package Problems;
import java.util.*;

public class NumberOfVisiblePeopleInAQueue {
	public int[] canSeePersonsCount(int[] heights) {
		int len = heights.length;
		int ans[] = new int[len];
		Deque<Integer> stack = new ArrayDeque<>();

		for (int i = len - 1; i >= 0; i--) {
			while (!stack.isEmpty() && stack.peek() < heights[i]) {
				stack.pop();
				ans[i]++;
			}

			if (!stack.isEmpty()) {
				ans[i]++;
			}

			stack.push(heights[i]);

		}
		return ans;
	}
}
