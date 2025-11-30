package Problems;
import java.util.*;

public class DeepestLeavesSum {
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
		public int deepestLeavesSum(TreeNode root) {
			Deque<TreeNode> arrDeque = new ArrayDeque<>();
			int sum = 0;

			arrDeque.offer(root);
			while (!arrDeque.isEmpty()) {
				int levelSize = arrDeque.size();
				sum = 0;

				for (int i = 0; i < levelSize; i++) {
					TreeNode current = arrDeque.poll();
					sum += current.val;
					if (current.left != null)
						arrDeque.offer(current.left);
					if (current.right != null)
						arrDeque.offer(current.right);
				}
			}

			return sum;
		}
	}
}
