package Problems;

public class SumRootToLeafNumbers {
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

		public int sumNumbers(TreeNode root) {
			dfs(root, "");
			return sum;
		}

		private void dfs(TreeNode node, String rootToLeaf) {
			if (node == null)
				return;

			rootToLeaf = rootToLeaf + node.val;

			if (node.left == null && node.right == null) {
				int number = stringToInt(rootToLeaf);
				sum += number;
				return;
			}

			dfs(node.left, rootToLeaf);
			dfs(node.right, rootToLeaf);

		}

		private int stringToInt(String s) {
			int num = 0;
			for (char c : s.toCharArray()) {
				num = num * 10 + (c - '0');
			}
			return num;
		}

	}
}
