package ds.tree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

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
		root = insert(root, value);
	}

	public Node insert(Node node, int value) {
		if (node == null) {
			node = new Node(value);
		} else if (value < node.getValue()) {
			node.setLeft(insert(node.getLeft(), value));
		} else if (value > node.getValue()) {
			node.setRight(insert(node.getRight(), value));
		}
		return node;
	}

	public int getLargestValue() {
		Node node = getLargestNode(root);
		if (node == null)
			throw new RuntimeException("Not found.");
		return node.getValue();
	}

	public int getSecondLargestValue() {
		Node node = getSecondLargestNode(root);
		if (node == null)
			throw new RuntimeException("Not found.");
		return node.getValue();
	}

	private Node getLargestNode(Node node) {
		Node temp = node;
		while (temp.getRight() != null)
			temp = temp.getRight();
		return temp;

	}

	private Node getSecondLargestNode(Node node) {
		if (node == null)
			return null;
		if (node.getLeft() == null && node.getRight() == null)
			throw new RuntimeException("Tree must have two values");

		while (node != null) {
			if (node.getLeft() != null && node.getRight() == null)
				return getLargestNode(node.getLeft());
			if (node.getRight() != null) {
				if (node.getRight().getRight() == null && node.getRight().getLeft() == null)
					return node;
				node = node.getRight();
			}
		}

		return null;

	}

	public boolean isSuperBalanced() {

		// TODO: Incomplete Method!!
		Set<Integer> depths = new HashSet<Integer>();
		Node temp = root;
		int currentDepth = 0;
		return true;

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
		}

	}

	public void inOrder(Node n) {
		if (n.getLeft() != null) {
			inOrder(n.getLeft());
		}

		System.out.println(n);

		if (n.getRight() != null) {
			inOrder(n.getRight());
		}
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
