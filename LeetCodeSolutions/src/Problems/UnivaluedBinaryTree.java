package Problems;
import java.util.*;

public class UnivaluedBinaryTree {
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
		public boolean isUnivalTree(TreeNode root) {
			Set<Integer> hshSet = new HashSet<>();
			hshSet.add(root.val);

			dfs(root, hshSet);
			return hshSet.size() <= 1;

		}

		private void dfs(TreeNode node, Set<Integer> hshSet) {
			if (node == null)
				return;

			hshSet.add(node.val);

			dfs(node.left, hshSet);
			dfs(node.right, hshSet);

		}
	}
}
