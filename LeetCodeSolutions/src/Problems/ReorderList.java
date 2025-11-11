package Problems;
import java.util.*;

public class ReorderList {
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
		public void reorderList(ListNode head) {

			Deque<Integer> arrDeque = new ArrayDeque<>();
			ListNode current = head;

			while (current != null) {
				int number = current.val;

				arrDeque.offer(number);
				current = current.next;
			}

			current = head;
			boolean fromFront = true;

			while (!arrDeque.isEmpty()) {
				if (fromFront) {
					current.val = arrDeque.pollFirst();
				} else {
					current.val = arrDeque.pollLast();
				}
				fromFront = !fromFront;

				if (current.next != null)
					current = current.next;
				else
					break;
			}
		}
	}
}
