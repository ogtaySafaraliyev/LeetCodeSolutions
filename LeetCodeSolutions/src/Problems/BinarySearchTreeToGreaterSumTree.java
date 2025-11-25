package Problems;

public class BinarySearchTreeToGreaterSumTree {
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

		public TreeNode bstToGst(TreeNode root) {
			reverseOrder(root);
			return root;
		}

		private void reverseOrder(TreeNode root) {
			if (root == null)
				return;
			reverseOrder(root.right);

			sumOfCurrentNode += root.val;
			root.val = sumOfCurrentNode;

			reverseOrder(root.left);
		}
	}
}
