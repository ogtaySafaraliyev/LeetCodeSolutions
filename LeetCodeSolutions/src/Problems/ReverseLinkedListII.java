package Problems;
import java.util.*;

public class ReverseLinkedListII {
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
		// public ListNode reverseBetween(ListNode head, int left, int right) {
		// List<Integer> list = new ArrayList<>();

		// ListNode current = head;
		// while (current != null) {
		// list.add(current.val);
		// current = current.next;
		// }

		// Deque<Integer> arrDeque = new ArrayDeque<>();

		// for(int i = left - 1; i < right; i++) {
		// arrDeque.offer(list.get(i));
		// }

		// for(int i = left - 1; i < right; i++) {
		// list.set(i, arrDeque.removeLast());
		// }

		// ListNode dummy = new ListNode();
		// ListNode tail = dummy;

		// for (int num : list) {
		// tail.next = new ListNode(num);
		// tail = tail.next;
		// }

		// return dummy.next;

		// }

		public ListNode reverseBetween(ListNode head, int left, int right) {
			List<Integer> list = new ArrayList<>();

			ListNode current = head;
			while (current != null) {
				list.add(current.val);
				current = current.next;
			}

			List<Integer> rangeList = new ArrayList<>();
			for (int i = left - 1; i < right; i++) {
				rangeList.add(list.get(i));
			}

			Collections.reverse(rangeList);
			int j = 0;
			for (int i = left - 1; i < right; i++) {

				list.set(i, rangeList.get(j));
				j++;
			}

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
