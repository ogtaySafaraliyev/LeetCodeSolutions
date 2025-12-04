package Problems;
import java.util.*;

public class BinaryTreePaths {
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
		public List<String> binaryTreePaths(TreeNode root) {
			List<String> paths = new ArrayList<>();
			if (root == null)
				return paths;

			String path = "";
			dfs(root, paths, path);
			return paths;
		}

		private void dfs(TreeNode node, List<String> paths, String path) {
			if (node == null)
				return;

			if (path.isEmpty()) {
				path = path + node.val;
			} else {
				path = path + "->" + node.val;
			}

			// if we reach to leaf then add to list
			if (node.left == null && node.right == null) {
				paths.add(path);
			}

			dfs(node.left, paths, path);
			dfs(node.right, paths, path);
		}
	}
}
