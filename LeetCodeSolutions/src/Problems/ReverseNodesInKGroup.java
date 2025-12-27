package Problems;
import java.util.*;

public class ReverseNodesInKGroup {
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
		public ListNode reverseKGroup(ListNode head, int k) {
			if (head == null || k == 1)
				return head;

			ListNode dummy = new ListNode(0);
			ListNode tail = dummy;
			ListNode current = head;

			while (current != null) {
				Stack<ListNode> stack = new Stack<>();
				ListNode temp = current;

				// collect k nodes
				for (int i = 0; i < k && temp != null; i++) {
					stack.push(temp);
					temp = temp.next;
				}

				// if we got fewer than k nodes → no reverse
				if (stack.size() < k) {
					tail.next = current;
					break;
				}

				// reverse by popping stack
				while (!stack.isEmpty()) {
					tail.next = stack.pop();
					tail = tail.next;
				}

				// move current forward
				current = temp;
				tail.next = null; // cut old links
			}

			return dummy.next;

		}
	}
}
