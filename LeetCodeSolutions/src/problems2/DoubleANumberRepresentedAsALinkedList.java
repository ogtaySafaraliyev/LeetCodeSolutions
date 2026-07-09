package problems2;
import java.util.*;

public class DoubleANumberRepresentedAsALinkedList {
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
		public ListNode doubleIt(ListNode head) {

			Deque<Integer> stack = new ArrayDeque<>();
			ListNode curr = head;
			while (curr != null) {
				stack.push(curr.val);
				curr = curr.next;
			}

			ListNode newHead = null;
			int carry = 0;

			while (!stack.isEmpty()) {
				int doubled = stack.pop() * 2 + carry;
				carry = doubled / 10;
				newHead = new ListNode(doubled % 10, newHead);
			}

			if (carry > 0) {
				newHead = new ListNode(carry, newHead);
			}
			return newHead;

		}
	}
}
