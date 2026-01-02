package Problems;
import java.util.*;

public class SameTree {
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
		public boolean isSameTree(TreeNode p, TreeNode q) {
			List<Integer> list1 = new ArrayList<Integer>();
			List<Integer> list2 = new ArrayList<Integer>();
			dfs(p, list1);
			dfs(q, list2);
			for (Integer num : list1) {
				System.out.print(num + " ");
			}
			return list1.equals(list2);

		}

		private void dfs(TreeNode node, List<Integer> list) {
			if (node == null) {
				list.add(null);
				return;
			}
			list.add(node.val);
			dfs(node.left, list);
			dfs(node.right, list);
		}
	}
}
