package Problems;

public class ConvertBinaryNumberInALinkedListToInteger {
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
		public int getDecimalValue(ListNode head) {
			StringBuilder binary = new StringBuilder();
			ListNode current = head;

			while (current != null) {
				binary.append(current.val);
				current = current.next;
			}

			return Integer.parseInt(binary.toString(), 2);
		}
	}
}
