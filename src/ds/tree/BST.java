package ds.tree;

public class BST {

	private Node root;

	public enum Traversal {
		INORDER, PREORDER, POSTORDER
	}

	public BST(int value) {
		root = new Node(value);
	}

	public BST() {

	}

	public void insert(int value) {
		if (root == null) {
			root = new Node(value);
		}

		if (value < root.getValue()) {
			root.setLeft(value);
		} else if (value > root.getValue()) {
			root.setRight(value);
		}
	}
	
	

	public void remove(int value) {
		if (root == null)
			throw new RuntimeException("Tree Empty!");

	}

	public void traversal(Traversal type) {

		switch (type) {
		case INORDER:
			this.inOrder(root);
			break;
		case PREORDER:
			this.preOrder(root);
			break;
		case POSTORDER:
			this.postOrder(root);
			break;
		default:
			break;
		}

	}

	public void inOrder(Node n) {
		if (n.getLeft() != null)
			inOrder(n.getLeft());
		System.out.println(n);
		if (n.getRight() != null)
			inOrder(n.getRight());
	}

	public void preOrder(Node n) {

		System.out.println(n);

		if (n.getLeft() != null)
			inOrder(n.getLeft());

		if (n.getRight() != null)
			inOrder(n.getRight());
	}

	public void postOrder(Node n) {
		if (n.getLeft() != null)
			inOrder(n.getLeft());

		if (n.getRight() != null)
			inOrder(n.getRight());

		System.out.println(n);
	}

}
