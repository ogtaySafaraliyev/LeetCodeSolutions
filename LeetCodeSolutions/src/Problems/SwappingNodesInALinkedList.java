package Problems;
import java.util.*;

public class SwappingNodesInALinkedList {
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
		public ListNode swapNodes(ListNode head, int k) {
			ListNode current = head;
			List<Integer> values = new ArrayList<>();

			while (current != null) {
				values.add(current.val);
				current = current.next;
			}

			int n = values.size();
			int temp = values.get(k - 1);
			values.set(k - 1, values.get(n - k));
			values.set(n - k, temp);

			ListNode dummy = new ListNode();
			current = dummy;

			for (Integer elmnt : values) {
				current.next = new ListNode(elmnt);
				current = current.next;
			}
			return dummy.next;
		}
	}
}
