package Problems;
import java.util.*;

public class FlattenBinaryTreeToLinkedList {
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

		public void flatten(TreeNode root) {
			if (root == null)
				return;
			List<TreeNode> list = new ArrayList<>();
			dfs(root, list);

			if (list.isEmpty() || list == null)
				return;

			for (int i = 0; i < list.size() - 1; i++) {
				TreeNode current = list.get(i);
				TreeNode next = list.get(i + 1);

				current.left = null;
				current.right = next;
			}

			TreeNode last = list.get(list.size() - 1);
			last.left = null;
			last.right = null;
		}

		private void dfs(TreeNode node, List<TreeNode> list) {
			if (node == null)
				return;

			list.add(node);

			dfs(node.left, list);
			dfs(node.right, list);
		}
	}
}
