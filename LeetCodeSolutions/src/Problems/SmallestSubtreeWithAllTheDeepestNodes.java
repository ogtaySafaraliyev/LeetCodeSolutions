package Problems;
import java.util.*;

public class SmallestSubtreeWithAllTheDeepestNodes {
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
		public TreeNode subtreeWithAllDeepest(TreeNode root) {

			// firstly traverse with bfs
			if (root == null)
				return null;

			Deque<TreeNode> arrDeque = new ArrayDeque<>();
			List<TreeNode> deepest = new ArrayList<>();
			arrDeque.offer(root);

			while (!arrDeque.isEmpty()) {
				int size = arrDeque.size();
				deepest.clear();

				for (int i = 0; i < size; i++) {
					TreeNode node = arrDeque.poll();
					deepest.add(node);

					if (node.left != null)
						arrDeque.offer(node.left);
					if (node.right != null)
						arrDeque.offer(node.right);
				}
			}
			// LCA of all deepest nodes
			TreeNode ans = deepest.get(0);
			for (int i = 1; i < deepest.size(); i++) {
				ans = lca(root, ans, deepest.get(i));
			}

			return ans;
		}

		private TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
			if (root == null || root == p || root == q)
				return root;

			TreeNode left = lca(root.left, p, q);
			TreeNode right = lca(root.right, p, q);

			if (left != null && right != null)
				return root;
			return left != null ? left : right;
		}
	}
}
