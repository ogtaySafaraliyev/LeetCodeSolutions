package Problems;
import java.util.*;

public class SumOfNodesWithEvenValuedGrandparent {
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
		public int sumEvenGrandparent(TreeNode root) {
			int sum = 0;
			if (root == null)
				return sum;

			Deque<TreeNode> arrDeque = new ArrayDeque<>();
			arrDeque.offer(root);

			while (!arrDeque.isEmpty()) {
				int size = arrDeque.size();

				for (int i = 0; i < size; i++) {
					TreeNode node = arrDeque.poll();

					if (node.val % 2 == 0) {

						if (node.left != null) {
							if (node.left.left != null)
								sum += node.left.left.val;
							if (node.left.right != null)
								sum += node.left.right.val;
						}

						if (node.right != null) {
							if (node.right.left != null)
								sum += node.right.left.val;
							if (node.right.right != null)
								sum += node.right.right.val;
						}
					}
					if (node.left != null)
						arrDeque.offer(node.left);
					if (node.right != null)
						arrDeque.offer(node.right);
				}
			}
			return sum;
		}
	}
}
