package Problems;
import java.util.*;

public class BinaryTreeLevelOrderTraversal {
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
		public List<List<Integer>> levelOrder(TreeNode root) {

			List<List<Integer>> levels = new ArrayList<>();
			Deque<TreeNode> arrDeque = new ArrayDeque<>();
			if (root == null) {
				return levels;
			}
			arrDeque.offer(root);

			while (!arrDeque.isEmpty()) {
				int levelSize = arrDeque.size();
				List<Integer> level = new ArrayList<>();

				for (int i = 0; i < levelSize; i++) {
					TreeNode node = arrDeque.poll();
					level.add(node.val);

					if (node.left != null) {
						arrDeque.offer(node.left);
					}
					if (node.right != null) {
						arrDeque.offer(node.right);
					}
				}
				levels.add(level);
			}
			return levels;
		}
	}
}
