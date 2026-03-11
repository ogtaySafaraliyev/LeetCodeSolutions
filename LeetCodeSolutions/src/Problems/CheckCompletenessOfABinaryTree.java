package Problems;
import java.util.*;

import Problems.CheckCompletenessOfABinaryTree.TreeNode;

public class CheckCompletenessOfABinaryTree {
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
		public boolean isCompleteTree(TreeNode root) {
			Deque<TreeNode> arrDeque = new LinkedList<TreeNode>();
			arrDeque.offer(root);
			boolean seenNull = false;

			while (!arrDeque.isEmpty()) {
				int size = arrDeque.size();

				for (int i = 0; i < size; i++) {
					TreeNode node = arrDeque.poll();

					if (node == null) {
						seenNull = true;
					} else {
						if (seenNull)
							return false;

						arrDeque.offer(node.left);
						arrDeque.offer(node.right);
					}
				}
			}
			return seenNull;
		}
	}
}
