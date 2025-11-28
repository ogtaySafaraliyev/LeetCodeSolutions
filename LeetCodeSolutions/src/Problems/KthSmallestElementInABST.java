package Problems;
import java.util.*;

public class KthSmallestElementInABST {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public int kthSmallest(TreeNode root, int k) {
			Deque<Integer> arrDeque = new ArrayDeque<>();
			dfs(root, arrDeque);
			while (k > 1) {
				arrDeque.poll();
				k--;
			}
			return arrDeque.peek();
		}

		private void dfs(TreeNode root, Deque<Integer> deque) {
			if (root == null)
				return;
			dfs(root.left, deque);
			int value = root.val;
			deque.offer(value);
			dfs(root.right, deque);
		}
	}
}
