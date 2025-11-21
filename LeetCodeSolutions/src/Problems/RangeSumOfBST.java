package Problems;
import java.util.*;

public class RangeSumOfBST {
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
		public int rangeSumBST(TreeNode root, int low, int high) {
			List<Integer> list = new ArrayList<>();
			inorderTraversal(root, list);

			int sum = 0;
			for (int val : list) {
				if (val >= low && val <= high) {
					sum += val;
				}
			}
			return sum;
		}

		private void inorderTraversal(TreeNode node, List<Integer> list) {
			if (node == null) {
				return;
			}
			inorderTraversal(node.left, list);
			list.add(node.val);
			inorderTraversal(node.right, list);
		}
	}
}
