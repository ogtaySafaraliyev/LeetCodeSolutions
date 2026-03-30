package Problems;

public class MaximumDifferenceBetweenNodeAndAncestor {
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
		public int maxAncestorDiff(TreeNode root) {
			return dfs(root, root.val, root.val);
		}

		private int dfs(TreeNode node, int max, int min) {
			if (node == null)
				return max - min;

			max = Math.max(node.val, max);
			min = Math.min(node.val, min);

			int left = dfs(node.left, max, min);
			int right = dfs(node.right, max, min);

			return Math.max(left, right);
		}
	}
}
