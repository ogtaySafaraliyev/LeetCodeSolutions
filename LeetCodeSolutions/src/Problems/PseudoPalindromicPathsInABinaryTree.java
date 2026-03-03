package Problems;

public class PseudoPalindromicPathsInABinaryTree {
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
		int count = 0;

		public int pseudoPalindromicPaths(TreeNode root) {
			dfs(root, new int[10]);
			return count;
		}

		private void dfs(TreeNode node, int[] freq) {
			if (node == null)
				return;

			freq[node.val]++;

			if (node.left == null && node.right == null) {
				if (isPseudoPalindrome(freq)) {
					count++;
				}
			} else {
				dfs(node.left, freq);
				dfs(node.right, freq);
			}

			freq[node.val]--; // backtrack
		}

		private boolean isPseudoPalindrome(int[] freq) {
			int odd = 0;
			for (int i = 1; i <= 9; i++) {
				if (freq[i] % 2 == 1)
					odd++;
			}
			return odd <= 1;
		}
	}
}
