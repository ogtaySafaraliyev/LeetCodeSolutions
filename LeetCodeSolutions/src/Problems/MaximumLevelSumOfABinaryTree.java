package Problems;
import java.util.*;

public class MaximumLevelSumOfABinaryTree {
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
		public int maxLevelSum(TreeNode root) {
			List<Integer> list = new ArrayList<>();

			if (root == null) {
				return 0;
			}

			Deque<TreeNode> arrDeque = new ArrayDeque<>();
			arrDeque.offer(root);
			int max = Integer.MIN_VALUE;

			while (!arrDeque.isEmpty()) {
				int levelSize = arrDeque.size();
				int levelSum = 0;

				for (int i = 0; i < levelSize; i++) {
					TreeNode node = arrDeque.poll();

					levelSum += node.val;

					if (node.left != null)
						arrDeque.offer(node.left);
					if (node.right != null)
						arrDeque.offer(node.right);
				}

				list.add(levelSum);
				max = Math.max(max, levelSum);

			}

			return list.indexOf(max) + 1;
		}
	}
}
