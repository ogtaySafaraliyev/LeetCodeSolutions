package Problems;
import java.util.*;

public class AddOneRowToTree {
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
		public TreeNode addOneRow(TreeNode root, int val, int depth) {
			if (depth == 1) {
				TreeNode newRoot = new TreeNode(val);
				newRoot.left = root;
				return newRoot;
			}

			Deque<TreeNode> arrDeque = new ArrayDeque<>();
			arrDeque.offer(root);

			int level = 1;
			while (!arrDeque.isEmpty()) {
				int size = arrDeque.size();

				if (level == depth - 1) {

					for (int i = 0; i < size; i++) {
						TreeNode node = arrDeque.poll();

						TreeNode oldLeft = node.left;
						TreeNode oldRight = node.right;

						node.left = new TreeNode(val);
						node.right = new TreeNode(val);

						node.left.left = oldLeft;
						node.right.right = oldRight;
					}
					break;
				}

				for (int i = 0; i < size; i++) {
					TreeNode node = arrDeque.poll();

					if (node.left != null)
						arrDeque.offer(node.left);
					if (node.right != null)
						arrDeque.offer(node.right);
				}
				level++;
			}
			return root;
		}
	}
}
