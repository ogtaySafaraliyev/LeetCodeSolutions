package Problems;
import java.util.*;

public class LowestCommonAncestorOfDeepestLeaves {
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
		public TreeNode lcaDeepestLeaves(TreeNode root) {
			List<TreeNode> deepestLeaves = new ArrayList<>();

			if (root == null)
				return null;

			Deque<TreeNode> arrDeque = new ArrayDeque<>();
			arrDeque.offer(root);

			while (!arrDeque.isEmpty()) {
				int size = arrDeque.size();
				deepestLeaves.clear();

				for (int i = 0; i < size; i++) {
					TreeNode node = arrDeque.poll();

					deepestLeaves.add(node);

					if (node.left != null)
						arrDeque.offer(node.left);
					if (node.right != null)
						arrDeque.offer(node.right);
				}
			}

			TreeNode ans = deepestLeaves.get(0);
			for (int i = 1; i < deepestLeaves.size(); i++) {
				ans = lca(root, ans, deepestLeaves.get(i));
			}
			return ans;
		}

		private TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
			if (root == null || root == p || root == q) {
				return root;
			}

			TreeNode left = lca(root.left, p, q);
			TreeNode right = lca(root.right, p, q);

			if (left != null && right != null)
				return root;
			return (left != null) ? left : right;

		}
	}
}
