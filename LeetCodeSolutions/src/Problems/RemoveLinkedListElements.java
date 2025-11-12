package Problems;
import java.util.*;

public class RemoveLinkedListElements {
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
		public ListNode removeElements(ListNode head, int val) {
			Deque<Integer> arrDeque = new ArrayDeque<>();

			ListNode current = head;
			while (current != null) {
				int value = current.val;
				if (value != val) {
					arrDeque.offer(value);
				}
				current = current.next;
			}

			ListNode dummy = new ListNode();
			ListNode tail = dummy;
			while (!arrDeque.isEmpty()) {
				int value = arrDeque.poll();
				tail.next = new ListNode(value);
				tail = tail.next;
			}

			return dummy.next;
		}
	}
}
