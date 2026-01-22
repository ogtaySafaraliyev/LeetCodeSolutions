package Problems;
import java.util.*;

public class NAryTreePostorderTraversal {
	// Definition for a Node.
	class Node {
		public int val;
		public List<Node> children;

		public Node() {
		}

		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, List<Node> _children) {
			val = _val;
			children = _children;
		}
	}

	class Solution {
		private List<Integer> list = new ArrayList<>();

		public List<Integer> postorder(Node root) {
			postOrderDFS(root);
			return list;
		}

		private void postOrderDFS(Node node) {
			if (node == null)
				return;

			for (Node child : node.children) {
				postOrderDFS(child);
			}

			list.add(node.val);
		}
	}
}
