package Problems;

public class SumOfRootToLeafBinaryNumbers {
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
		private int sum = 0;

		public int sumRootToLeaf(TreeNode root) {
			int number = 0;

			dfs(root, number);
			return sum;
		}

		private void dfs(TreeNode node, int number) {
			if (node == null)
				return;

			number = number * 2 + node.val;

			if (node.left == null && node.right == null) {
				sum += number;
				return;
			}

			dfs(node.left, number);
			dfs(node.right, number);
		}
	}
}
