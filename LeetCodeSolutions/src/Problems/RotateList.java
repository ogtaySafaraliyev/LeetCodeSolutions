package Problems;
import java.util.*;

public class RotateList {

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
		public ListNode rotateRight(ListNode head, int k) {
			Deque<Integer> arrDeque = new ArrayDeque<>();

			ListNode current = head;
			while (current != null) {
				int num = current.val;
				current = current.next;

				arrDeque.offer(num);
			}

			ListNode dummy = new ListNode();
			ListNode tail = dummy;

			if (arrDeque.isEmpty()) {
				return null; // ListNode
			}

			int len = arrDeque.size();
			k = k % len;

			for (int i = 0; i < k; i++) {
				int num = arrDeque.removeLast();
				arrDeque.offerFirst(num);
			}

			while (!arrDeque.isEmpty()) {
				int num = arrDeque.poll();

				tail.next = new ListNode(num);
				tail = tail.next;
			}

			return dummy.next;
		}
	}
}
