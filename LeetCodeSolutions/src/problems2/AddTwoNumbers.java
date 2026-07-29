package problems2;

import java.util.*;

public class AddTwoNumbers {
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
		public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			Deque<Integer> firstNum = new ArrayDeque<>();
			Deque<Integer> secondNum = new ArrayDeque<>();

			while (l1 != null) {
				firstNum.offer(l1.val);
				l1 = l1.next;
			}

			while (l2 != null) {
				secondNum.offer(l2.val);
				l2 = l2.next;
			}

			ListNode dummy = new ListNode();
			ListNode curr = dummy;
			int carry = 0;

			while (!firstNum.isEmpty() || !secondNum.isEmpty() || carry != 0) {
				int x = firstNum.isEmpty() ? 0 : firstNum.poll();
				int y = secondNum.isEmpty() ? 0 : secondNum.poll();
				int sum = x + y + carry;
				carry = sum / 10;

				curr.next = new ListNode(sum % 10);
				curr = curr.next;
			}

			return dummy.next;
		}
	}
}
