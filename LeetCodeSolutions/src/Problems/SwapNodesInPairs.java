package Problems;

import java.util.*;

public class SwapNodesInPairs {
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
		public ListNode swapPairs(ListNode head) {
			List<Integer> list = new ArrayList<>();

			ListNode current = head;
			while (current != null) {
				list.add(current.val);
				current = current.next;
			}

			for (int i = 0; i < list.size() - 1; i += 2) {
				int temp = list.get(i);
				list.set(i, list.get(i + 1));
				list.set((i + 1), temp);
			}

			ListNode dummy = new ListNode();
			ListNode tail = dummy;

			for (int num : list) {
				tail.next = new ListNode(num);
				tail = tail.next;
			}
			return dummy.next;

		}
	}
}
