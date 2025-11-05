package Problems;
import java.util.*;

public class PartitionList {
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
		public ListNode partition(ListNode head, int x) {
			Deque<Integer> smallerOnes = new ArrayDeque<>();
			Deque<Integer> biggerOnes = new ArrayDeque<>();

			ListNode current = head;
			while (current != null) {
				int value = current.val;
				current = current.next;

				if (value < x) {
					smallerOnes.offer(value);
				} else {
					biggerOnes.offer(value);
				}
			}

			ListNode dummy = new ListNode();
			ListNode tail = dummy;

			while (!smallerOnes.isEmpty()) {
				int value = smallerOnes.poll();
				tail.next = new ListNode(value);
				tail = tail.next;
			}

			while (!biggerOnes.isEmpty()) {
				int value = biggerOnes.poll();
				tail.next = new ListNode(value);
				tail = tail.next;
			}

			return dummy.next;
		}
	}
}
