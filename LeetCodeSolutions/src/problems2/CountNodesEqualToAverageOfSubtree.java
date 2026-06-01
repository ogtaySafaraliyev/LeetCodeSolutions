package problems2;

public class CountNodesEqualToAverageOfSubtree {
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
		private int neededNodesCount;

		public int averageOfSubtree(TreeNode root) {
			dfs(root);
			return neededNodesCount;
		}

		private int[] dfs(TreeNode node) {
			if (node == null)
				return new int[] { 0, 0 };

			int[] leftSubtree = dfs(node.left);
			int[] rightSubtree = dfs(node.right);

			int subtreeValsSum = leftSubtree[0] + rightSubtree[0] + node.val;

			int subtreeNodeCount = leftSubtree[1] + rightSubtree[1] + 1;

			if (subtreeValsSum / subtreeNodeCount == node.val) {
				neededNodesCount++;
			}

			return new int[] { subtreeValsSum, subtreeNodeCount };
		}
	}
}
