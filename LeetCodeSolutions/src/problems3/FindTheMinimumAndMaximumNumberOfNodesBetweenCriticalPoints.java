package problems3;
import java.util.*;

public class FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public int[] nodesBetweenCriticalPoints(ListNode head) {
			List<Integer> list = new ArrayList<>();
			ListNode curr = head;

			while (curr != null) {
				int num = curr.val;
				list.add(num);
				curr = curr.next;
			}

			List<Integer> indexes = new ArrayList<>();

			for (int i = 1; i < list.size() - 1; i++) {
				int number = list.get(i);
				boolean isMin = number < list.get(i - 1) && number < list.get(i + 1);
				boolean isMax = number > list.get(i - 1) && number > list.get(i + 1);
				if (isMin || isMax) {
					indexes.add(i);
				}
			}

			if (indexes == null || indexes.size() < 2) {

				return new int[] { -1, -1 };
			}

			int maxDiff = indexes.get(indexes.size() - 1) - indexes.get(0);

			int minDiff = Integer.MAX_VALUE;
			for (int i = 1; i < indexes.size(); i++) {
				int currentDiff = indexes.get(i) - indexes.get(i - 1);
				if (currentDiff < minDiff) {
					minDiff = currentDiff;
				}
			}

			return new int[] { minDiff, maxDiff };
		}
	}
}
