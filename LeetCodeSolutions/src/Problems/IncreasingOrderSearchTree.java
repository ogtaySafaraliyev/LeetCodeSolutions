package Problems;

public class IncreasingOrderSearchTree {
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
		private TreeNode prev;

		public TreeNode increasingBST(TreeNode root) {
			TreeNode dummy = new TreeNode();
			prev = dummy;

			inOrderTraverse(root);

			return dummy.right;
		}

		private void inOrderTraverse(TreeNode node) {
			if (node == null)
				return;

			inOrderTraverse(node.left);

			node.left = null;
			prev.right = node;
			prev = node;

			inOrderTraverse(node.right);
		}
	}
}
