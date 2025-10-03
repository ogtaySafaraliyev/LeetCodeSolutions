package Problems;

import java.util.*;

public class ReverseLinkedList {
	class ListNode {
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
		public ListNode reverseList(ListNode head) {
			Stack<Integer> stack = new Stack<>();

			ListNode current = head;
			while (current != null) {
				stack.push(current.val);
				current = current.next;
			}

			ListNode dummy = new ListNode();
			ListNode pointer = dummy;

			while (!stack.isEmpty()) {
				pointer.next = new ListNode(stack.pop());
				pointer = pointer.next;
			}

			return dummy.next;

		}
	}
}
