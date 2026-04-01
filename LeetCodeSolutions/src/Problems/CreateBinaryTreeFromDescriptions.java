package Problems;

import java.util.*;

public class CreateBinaryTreeFromDescriptions {
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
		public TreeNode createBinaryTree(int[][] descriptions) {

			Map<Integer, TreeNode> nodes = new HashMap<>();
			Set<Integer> children = new HashSet<>();

			for (int[] description : descriptions) {
				int parentValue = description[0];
				int childValue = description[1];
				int isLeft = description[2];

				if (!nodes.containsKey(parentValue)) {
					nodes.put(parentValue, new TreeNode(parentValue));
				}

				if (!nodes.containsKey(childValue)) {
					nodes.put(childValue, new TreeNode(childValue));
				}

				children.add(childValue);

				TreeNode parentNode = nodes.get(parentValue);
				TreeNode childNode = nodes.get(childValue);

				if (isLeft == 1)
					parentNode.left = childNode;
				else
					parentNode.right = childNode;
			}

			for (var entry : nodes.entrySet()) {
				if (!children.contains(entry.getKey())) {
					return entry.getValue();
				}
			}
			return null;
		}
	}
}
