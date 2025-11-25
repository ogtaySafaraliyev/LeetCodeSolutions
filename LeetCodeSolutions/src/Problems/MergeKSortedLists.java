package Problems;
import java.util.*;

public class MergeKSortedLists {
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
		public ListNode mergeKLists(ListNode[] lists) {
			PriorityQueue<Integer> priorQue = new PriorityQueue<>();

			for (ListNode node : lists) {
				Deque<Integer> queue = helperMethod(node);
				while (!queue.isEmpty()) {
					priorQue.offer(queue.poll());
				}
			}

			ListNode dummy = new ListNode();
			ListNode tail = dummy;

			while (!priorQue.isEmpty()) {
				tail.next = new ListNode(priorQue.poll());
				tail = tail.next;
			}
			return dummy.next;
		}

		private Deque<Integer> helperMethod(ListNode node) {
			ListNode current = node;
			Deque<Integer> arrDeque = new ArrayDeque<>();

			while (current != null) {
				arrDeque.offer(current.val);
				current = current.next;
			}
			return arrDeque;
		}
	}
}
