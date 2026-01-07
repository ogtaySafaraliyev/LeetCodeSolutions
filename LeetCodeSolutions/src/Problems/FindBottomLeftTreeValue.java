package Problems;
import java.util.*;

public class FindBottomLeftTreeValue {
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
		public int findBottomLeftValue(TreeNode root) { // bfs approach
			if (root == null)
				return 0;

			Deque<TreeNode> arrDeque = new ArrayDeque<>();
			arrDeque.offer(root);
			int ans = 0;

			while (!arrDeque.isEmpty()) {
				int size = arrDeque.size();

				for (int i = 0; i < size; i++) {
					TreeNode node = arrDeque.poll();

					if (i == 0)
						ans = node.val;
					if (node.left != null)
						arrDeque.offer(node.left);
					if (node.right != null)
						arrDeque.offer(node.right);

				}
			}
			return ans;
		}
	}
}
