package Problems;

import java.util.*;

public class PalindromeLinkedList {

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
		public boolean isPalindrome(ListNode head) {
			Deque<Integer> arrDeque = new ArrayDeque<>();

			ListNode current = head;
			while (current != null) {
				int value = current.val;
				arrDeque.offer(value);
				current = current.next;
			}

			int len = arrDeque.size();
			int[] orgnlOrder = new int[len];
			int k = 0;
			while (!arrDeque.isEmpty()) {
				orgnlOrder[k++] = arrDeque.poll();
			}

			int[] reversedOrder = new int[len];

			for (int i = 0; i < orgnlOrder.length; i++) {
				arrDeque.offer(orgnlOrder[i]);
			}

			int j = 0;
			while (!arrDeque.isEmpty()) {
				reversedOrder[j++] = arrDeque.removeLast();
			}

			return Arrays.equals(reversedOrder, orgnlOrder);
		}
	}
}
