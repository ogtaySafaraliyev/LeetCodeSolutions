package Problems;
import java.util.*;

public class ValidateBinarySearchTree {
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
		public boolean isValidBST(TreeNode root) {
			List<Integer> list = new ArrayList<>();

			dfs(root, list);

			Set<Integer> hshSet = new HashSet<>(list);

			List<Integer> sortedList = new ArrayList<>(list);
			Collections.sort(sortedList);

			return list.equals(sortedList) && hshSet.size() == list.size();
		}

		private void dfs(TreeNode root, List<Integer> list) {
			if (root == null)
				return;

			dfs(root.left, list);

			list.add(root.val);

			dfs(root.right, list);
		}

	}
}
