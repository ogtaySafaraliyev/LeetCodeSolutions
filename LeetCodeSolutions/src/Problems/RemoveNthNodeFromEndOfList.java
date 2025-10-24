package Problems;
import java.util.*;

public class RemoveNthNodeFromEndOfList {

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
		public ListNode removeNthFromEnd(ListNode head, int n) {
			Deque<Integer> stack = new ArrayDeque<>();

			ListNode current = head;
			while (current != null) {
				int value = current.val;
				stack.offer(value);
				current = current.next;
			}

			int wantedIndex = stack.size() - n;
			int size = stack.size();

			ListNode dummy = new ListNode();
			ListNode tail = dummy;

			for (int i = 0; i < size; i++) {
				int value = stack.poll();
				if (i == wantedIndex) {
					continue;
				}
				tail.next = new ListNode(value);
				tail = tail.next;
			}
			return dummy.next;

		}
	}
}
