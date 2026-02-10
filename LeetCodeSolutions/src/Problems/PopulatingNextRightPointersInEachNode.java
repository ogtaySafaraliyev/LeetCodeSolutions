package Problems;
import java.util.*;

public class PopulatingNextRightPointersInEachNode {
	class Node {
		public int val;
		public Node left;
		public Node right;
		public Node next;

		public Node() {
		}

		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, Node _left, Node _right, Node _next) {
			val = _val;
			left = _left;
			right = _right;
			next = _next;
		}
	};

	class Solution {
		public Node connect(Node root) {
			if (root == null)
				return null;

			Deque<Node> arrDeque = new ArrayDeque<>();
			arrDeque.offer(root);

			while (!arrDeque.isEmpty()) {
				int size = arrDeque.size();
				Node prevNode = null;

				for (int i = 0; i < size; i++) {
					Node currentNode = arrDeque.poll();

					if (prevNode != null) {
						prevNode.next = currentNode;
					}
					prevNode = currentNode;

					if (currentNode.left != null)
						arrDeque.offer(currentNode.left);
					if (currentNode.right != null)
						arrDeque.offer(currentNode.right);
				}
			}
			return root;
		}
	}
}
