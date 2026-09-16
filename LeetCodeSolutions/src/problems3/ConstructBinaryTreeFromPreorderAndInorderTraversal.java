package problems3;
import java.util.*;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
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

		private Map<Integer, Integer> inorderIndexMap;
		private int preOrderIndex;
		private int[] preorder;

		public TreeNode buildTree(int[] preorder, int[] inorder) {
			this.preorder = preorder;
			this.preOrderIndex = 0;

			inorderIndexMap = new HashMap<>();

			for (int i = 0; i < inorder.length; i++) {
				inorderIndexMap.put(inorder[i], i);
			}

			return build(0, inorder.length - 1);
		}

		private TreeNode build(int inorderLeft, int inorderRight) {
			if (inorderLeft > inorderRight) {
				return null;
			}

			int rootVal = preorder[preOrderIndex];
			preOrderIndex++;

			TreeNode root = new TreeNode(rootVal);

			int inorderRootIndex = inorderIndexMap.get(rootVal);

			root.left = build(inorderLeft, inorderRootIndex - 1);
			root.right = build(inorderRootIndex + 1, inorderRight);

			return root;
		}
	}
}
