package Problems;
import java.util.*;

public class DeleteNodesFromLinkedListPresentInArray {
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
		public ListNode modifiedList(int[] nums, ListNode head) {
			Set<Integer> hshSet = new HashSet<>();

			for (int num : nums) {
				hshSet.add(num);
			}

			List<Integer> list = new ArrayList<>();
			ListNode current = head;
			while (current != null) {
				list.add(current.val);
				current = current.next;
			}

			ListNode dummy = new ListNode();
			ListNode tail = dummy;
			for (int num : list) {
				if (!hshSet.contains(num)) {
					tail.next = new ListNode(num);
					tail = tail.next;
				}
			}
			return dummy.next;
		}
	}
}
