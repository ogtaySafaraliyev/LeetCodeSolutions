package Problems;
import java.util.*;

public class SumOfLeftLeaves {
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
		public int sumOfLeftLeaves(TreeNode root) {
			int sum = 0;
			if (root == null)
				return sum;

			Deque<TreeNode> arrDeque = new ArrayDeque<>();
			arrDeque.offer(root);

			while (!arrDeque.isEmpty()) {
				int size = arrDeque.size();

				for (int i = 0; i < size; i++) {
					TreeNode node = arrDeque.poll();

					if (node.left != null) {

						if (node.left.left == null && node.left.right == null) {
							sum += node.left.val;
						} else
							arrDeque.offer(node.left);
					}

					if (node.right != null)
						arrDeque.offer(node.right);
				}
			}
			return sum;
		}
	}
}
