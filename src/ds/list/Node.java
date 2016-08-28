package ds.list;

class Node {

	private Node next = null;
	private Node prev = null;
	private int data;

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	@Override
	public String toString() {
		return String.valueOf(data);
	}

	public int getData() {
		return data;
	}

	public Node() {
		this.data = 0;
	}

	public Node(int d) {
		this.data = d;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
