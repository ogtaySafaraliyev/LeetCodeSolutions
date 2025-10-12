package Problems;

import java.util.*;

public class RemoveDuplicatesFromSortedListII {

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
		public ListNode deleteDuplicates(ListNode head) {
			Map<Integer, Integer> freq = new LinkedHashMap<>();

			ListNode current = head;
			while (current != null) {
				int num = current.val;
				current = current.next;

				freq.put(num, freq.getOrDefault(num, 0) + 1);
			}

			ListNode dummy = new ListNode();
			ListNode tail = dummy;

			for (var elmnt : freq.entrySet()) {
				if (elmnt.getValue() == 1) {
					int num = elmnt.getKey();

					tail.next = new ListNode(num);
					tail = tail.next;
				}
			}
			return dummy.next;
		}
	}
}
