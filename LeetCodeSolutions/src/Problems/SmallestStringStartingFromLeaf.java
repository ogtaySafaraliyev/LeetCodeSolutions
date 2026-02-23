package Problems;
import java.util.*;

public class SmallestStringStartingFromLeaf {
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
		public String smallestFromLeaf(TreeNode root) {
			List<String> paths = new ArrayList<>();
			dfs(root, "", paths);

			for (int i = 0; i < paths.size(); i++) {
				paths.set(i, reverse(paths.get(i)));
			}

			Collections.sort(paths);
			return paths.get(0);
		}

		private void dfs(TreeNode node, String path, List<String> paths) {
			if (node == null)
				return;

			char ch = (char) (node.val + 97);
			path = path + ch;

			if (node.left == null && node.right == null) {
				paths.add(path);
				return;
			}

			dfs(node.left, path, paths);
			dfs(node.right, path, paths);
		}

		private String reverse(String path) {
			StringBuilder strBldr = new StringBuilder(path);
			return strBldr.reverse().toString();
		}
	}
}
