package ds.list;

public class DoublyLinkedList {


	private Node head;
	private int count;
	
	public DoublyLinkedList() {
		this.head = new Node();
		this.count = 0;
	}
	
	public void addFirst(int n) {
		Node node = new Node(n);
		node.setPrev(head);
		node.setNext(head.getNext());
		if(head.getNext() != null)
			head.getNext().setPrev(node);
		head.setNext(node);
	}
	
	public void addLast(int n) {
		Node node = new Node(n);
		Node temp = head;
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(node);
		node.setPrev(temp);

	}
	
	public void printList() {
		Node temp = head;
		while(temp.getNext() != null) {
			System.out.println(temp.getNext().getData());
			temp = temp.getNext();
		}
	}
	
	public void deleteNode(int d) {
		Node temp = head;
		while(temp.getNext() != null) {
			if(temp.getData() == d) {
				temp.getPrev().setNext(temp.getNext());
				temp.getNext().setPrev(temp.getPrev());
				return;
			}
			temp = temp.getNext();
		}
	}

}
