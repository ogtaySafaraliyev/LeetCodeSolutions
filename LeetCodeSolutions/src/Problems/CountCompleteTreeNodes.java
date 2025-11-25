package Problems;
import java.util.*;

public class CountCompleteTreeNodes {
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
		public int countNodes(TreeNode root) {
			List<Integer> list = new ArrayList<>();
			inorderTraverse(root, list);
			return list.size();
		}

		private void inorderTraverse(TreeNode root, List<Integer> list) {
			if (root == null)
				return;
			inorderTraverse(root.left, list);
			list.add(root.val);
			inorderTraverse(root.right, list);
		}
	}
}
