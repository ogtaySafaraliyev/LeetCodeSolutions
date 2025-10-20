package Problems;
import java.util.*;

public class SortList {
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
		public ListNode sortList(ListNode head) {
			List<Integer> list = new ArrayList<>();

			ListNode current = head;
			while (current != null) {
				list.add(current.val);
				current = current.next;
			}

			Collections.sort(list);

			ListNode dummy = new ListNode();
			ListNode tail = dummy;

			for (int num : list) {
				tail.next = new ListNode(num);
				tail = tail.next;
			}
			return dummy.next;
		}
	}
}
