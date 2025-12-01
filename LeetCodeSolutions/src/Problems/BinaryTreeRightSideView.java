package Problems;
import java.util.*;

public class BinaryTreeRightSideView {
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
		public List<Integer> rightSideView(TreeNode root) {
			Deque<TreeNode> arrDeque = new ArrayDeque<>();
			List<Integer> list = new ArrayList<>();
			if (root == null)
				return list;
			arrDeque.offer(root);

			while (!arrDeque.isEmpty()) {
				int levelSize = arrDeque.size();

				for (int i = 0; i < levelSize; i++) {
					TreeNode current = arrDeque.poll();

					if (current.left != null)
						arrDeque.offer(current.left);
					if (current.right != null)
						arrDeque.offer(current.right);
					if (i == levelSize - 1) {
						list.add(current.val);
					}
				}
			}
			return list;
		}
	}
}
