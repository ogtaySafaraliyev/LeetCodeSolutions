package Problems;

import java.util.*;

public class MergeNodesInBetweenZeros {

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
		public ListNode mergeNodes(ListNode head) {
			Deque<Integer> arrDQue = new ArrayDeque<>();
			int sum = 0;
			ListNode current = head.next;

			while (current != null) {
				if (current.val == 0) {
					arrDQue.offer(sum);
					sum = 0;
				} else {
					sum += current.val;
				}
				current = current.next;
			}

			ListNode dummy = new ListNode();
			ListNode tail = dummy;

			while (!arrDQue.isEmpty()) {
				int value = arrDQue.poll();
				tail.next = new ListNode(value);
				tail = tail.next;
			}

			return dummy.next;
		}
	}
}
