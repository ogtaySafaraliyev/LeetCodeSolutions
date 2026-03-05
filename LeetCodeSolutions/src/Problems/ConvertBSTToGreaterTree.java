package Problems;

public class ConvertBSTToGreaterTree {
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
		private int sumOfCurrentNode = 0;

		public TreeNode convertBST(TreeNode root) {
			dfs(root);
			return root;
		}

		private void dfs(TreeNode node) {
			if (node == null)
				return;
			dfs(node.right);

			sumOfCurrentNode += node.val;
			node.val = sumOfCurrentNode;

			dfs(node.left);
		}
	}
}
