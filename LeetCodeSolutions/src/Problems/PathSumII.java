package Problems;
import java.util.*;

public class PathSumII {
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

		public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
			List<List<Integer>> listOfPaths = new ArrayList<>();
			dfs(root, targetSum, new ArrayList<>(), listOfPaths);
			return listOfPaths;

		}

		private void dfs(TreeNode node, int targetSum, List<Integer> path, List<List<Integer>> listOfPaths) {
			if (node == null)
				return;

			path.add(node.val);

			targetSum -= node.val;

			if (node.left == null && node.right == null && targetSum == 0) {
				listOfPaths.add(new ArrayList<>(path));
			}

			dfs(node.left, targetSum, path, listOfPaths);
			dfs(node.right, targetSum, path, listOfPaths);

			path.remove(path.size() - 1);
		}
	}
}
