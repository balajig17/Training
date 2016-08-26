package ds.tree;

public class Node {

	private int value;
	private Node left;
	private Node right;

	public Node(int value) {
		this.value = value;
	}
	

	public int getValue() {
		return value;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}


	public void setLeft(int value) {
		if (left == null)
			left = new Node(value);
		else {
			if (value < left.getValue())
				left.setLeft(value);
			else if (value > left.getValue())
				left.setRight(value);
		}

	}

	public void setRight(int value) {

		if (right == null)
			right = new Node(value);
		else {
			if (value < right.getValue())
				right.setLeft(value);
			else if (value > right.getValue())
				right.setRight(value);
		}
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}

}
