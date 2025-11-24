package Problems;
import java.util.*;

public class AllElementsInTwoBinarySearchTrees {
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
		public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
			List<Integer> firstRootElmnts = new ArrayList<>();
			List<Integer> secondRootElmnts = new ArrayList<>();

			inorderTraversal(root1, firstRootElmnts);
			inorderTraversal(root2, secondRootElmnts);

			List<Integer> mergedList = new ArrayList<>();

			for (int i = 0; i < firstRootElmnts.size(); i++) {
				mergedList.add(firstRootElmnts.get(i));
			}

			for (int i = 0; i < secondRootElmnts.size(); i++) {
				mergedList.add(secondRootElmnts.get(i));
			}

			Collections.sort(mergedList);
			return mergedList;
		}

		private void inorderTraversal(TreeNode root, List<Integer> list) {
			if (root == null)
				return;
			inorderTraversal(root.left, list);
			list.add(root.val);
			inorderTraversal(root.right, list);
		}
	}
}
