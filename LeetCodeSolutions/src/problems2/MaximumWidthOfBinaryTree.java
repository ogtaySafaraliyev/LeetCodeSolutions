package problems2;
import java.util.*;

public class MaximumWidthOfBinaryTree {
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
		public int widthOfBinaryTree(TreeNode root) {
			int max = 0;
			Deque<TreeNode> nodeQueue = new ArrayDeque<>();
			Deque<Integer> indexQueue = new ArrayDeque<>();

			nodeQueue.offer(root);
			indexQueue.offer(0);

			while (!nodeQueue.isEmpty()) {
				int size = nodeQueue.size();
				int firstIndex = indexQueue.peek();
				int lastIndex = firstIndex;

				for (int i = 0; i < size; i++) {
					TreeNode node = nodeQueue.poll();
					int index = indexQueue.poll();
					lastIndex = index;

					if (node.left != null) {
						nodeQueue.offer(node.left);
						indexQueue.offer(index * 2);
					}
					if (node.right != null) {
						nodeQueue.offer(node.right);
						indexQueue.offer(index * 2 + 1);
					}
				}
				max = Math.max(max, lastIndex - firstIndex + 1);
			}
			return max;
		}
	}
}
