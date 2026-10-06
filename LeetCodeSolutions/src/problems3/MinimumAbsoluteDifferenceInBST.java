package problems3;
import java.util.*;

public class MinimumAbsoluteDifferenceInBST {
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

		public int getMinimumDifference(TreeNode root) {
			List<Integer> list = new ArrayList<>();

			dfs(root, list);

			int min = Integer.MAX_VALUE;
			for (int i = 0, j = 1; i < list.size() - 1 && j < list.size(); i++, j++) {
				int diff = list.get(j) - list.get(i);
				min = Math.min(diff, min);
			}
			return min;
		}

		private void dfs(TreeNode node, List<Integer> list) {
			if (node == null) {
				return;
			}

			dfs(node.left, list);

			list.add(node.val);

			dfs(node.right, list);
		}
	}
}
