package Problems;
import java.util.*;

public class DeleteNodesAndReturnForest {
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
		public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
			List<TreeNode> forest = new ArrayList<>();
			Map<Integer, Boolean> deleteMap = new HashMap<>();

			for (int val : to_delete) {
				deleteMap.put(val, true);
			}

			dfs(root, true, deleteMap, forest);
			return forest;
		}

		private TreeNode dfs(TreeNode node, boolean isRoot, Map<Integer, Boolean> deleteMap, List<TreeNode> forest) {

			if (node == null)
				return null;

			boolean toDelete = deleteMap.containsKey(node.val);

			// If this node is a root and not deleted → add to forest
			if (isRoot && !toDelete) {
				forest.add(node);
			}

			// FIX: children become roots ONLY if current node is deleted
			node.left = dfs(node.left, toDelete, deleteMap, forest);
			node.right = dfs(node.right, toDelete, deleteMap, forest);

			return toDelete ? null : node;
		}
	}
}
