package Problems;
import java.util.*;

public class MaximumDepthOfBinaryTree {
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
		public int maxDepth(TreeNode root) {
			if (root == null)
				return 0;

			Deque<TreeNode> arrDeque = new ArrayDeque<>();
			arrDeque.offer(root);
			int k = 0;

			while (!arrDeque.isEmpty()) {
				int levelSize = arrDeque.size();
				k++;

				for (int i = 0; i < levelSize; i++) {
					TreeNode current = arrDeque.poll();
					if (current.left != null)
						arrDeque.offer(current.left);
					if (current.right != null)
						arrDeque.offer(current.right);
				}
			}
			return k;
		}
	}
}
