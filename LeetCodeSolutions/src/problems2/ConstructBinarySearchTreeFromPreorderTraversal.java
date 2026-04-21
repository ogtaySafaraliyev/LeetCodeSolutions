package problems2;

public class ConstructBinarySearchTreeFromPreorderTraversal {
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
		public TreeNode bstFromPreorder(int[] preorder) {
			return build(preorder, 0, preorder.length - 1);
		}

		private TreeNode build(int[] arr, int start, int ending) {
			if (start > ending)
				return null;

			TreeNode root = new TreeNode(arr[start]);

			int i;
			for (i = start + 1; i <= ending; i++) {
				if (arr[i] > root.val)
					break;
			}

			root.left = build(arr, start + 1, i - 1);
			root.right = build(arr, i, ending);

			return root;
		}
	}
}
