package Walmart;

public class ViewBinaryTree {

	Node root;
	static int max_level = 0;

	void leftView() {
		leftViewUtility(root, 1);
	}

	// This method will print left view of subtree
	private void leftViewUtility(Node node, int level) {

		if (node == null) {
			return;
		}

		if (max_level < level) {
			System.out.print(node.data + " ");
			max_level = level;
		}

		leftViewUtility(node.left, level + 1);
		leftViewUtility(node.right, level + 1);
	}
	
	void rigthView() {
		rightViewUtility(root, 1);
	}
	
	// This method will print right view of subtree
	private void rightViewUtility(Node node, int level) {

		if (node == null) {
			return;
		}

		if (max_level < level) {
			System.out.println(" " + node.data);
			max_level = level;
		}

		rightViewUtility(node.right, level + 1);
		rightViewUtility(node.left, level + 1);
	}

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(12);
		tree.root.left = new Node(10);
		tree.root.right = new Node(30);
		tree.root.right.left = new Node(25);
		tree.root.right.right = new Node(40);

		tree.leftView();
		//tree.rigthView();
	}

}

class Node {

	int data;
	Node left, right;

	Node(int item) {
		this.data = item;
		left = right = null;
	}
}
