package Problems;
import java.util.*;

public class MergeInBetweenLinkedLists {
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
		// public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2)
		// {
		// List<Integer> arrList = new ArrayList<>();

		// ListNode current = list1;
		// while(current != null) {
		// arrList.add(current.val);
		// current = current.next;
		// }

		// for(int i = b; i >= a; i--) {
		// arrList.remove(i);
		// }

		// current = list2;
		// int index = a;
		// while(current != null) {
		// arrList.add(index++, current.val);

		// current = current.next;
		// }

		// ListNode dummy = new ListNode(0);
		// ListNode pointer = dummy;

		// for(int num: arrList) {
		// pointer.next = new ListNode(num);
		// pointer = pointer.next;
		// }
		// return dummy.next;
		// }

		public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
			ListNode prevA = list1;
			for (int i = 0; i < a - 1; i++) {
				prevA = prevA.next;
			}

			ListNode afterB = prevA;
			for (int i = 0; i <= b - a + 1; i++) {
				afterB = afterB.next;
			}

			prevA.next = list2;

			ListNode tail = list2;
			while (tail.next != null) {
				tail = tail.next;
			}

			tail.next = afterB;

			return list1;
		}
	}
}
