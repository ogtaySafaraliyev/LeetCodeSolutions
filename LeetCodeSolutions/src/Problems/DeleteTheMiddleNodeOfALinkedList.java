package Problems;
import java.util.*;

public class DeleteTheMiddleNodeOfALinkedList {
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
		public ListNode deleteMiddle(ListNode head) {
			Deque<Integer> arrQue = new ArrayDeque<>();
			int count = 0;
			ListNode current = head;
			while (current != null) {
				int value = current.val;
				arrQue.offer(value);
				count++;
				current = current.next;
			}
			int removedElmntPos = count / 2;

			ListNode dummy = new ListNode();
			ListNode tail = dummy;
			int i = 0;
			while (!arrQue.isEmpty()) {
				int value = arrQue.poll();
				if (removedElmntPos != i) {
					tail.next = new ListNode(value);
					tail = tail.next;
				}
				i++;
			}
			return dummy.next;
		}
	}
}
