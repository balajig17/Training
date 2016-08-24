package ds.list;

public class LinkedList {

	private Node head;
	private int count;
	
	public LinkedList() {
		this.head = new Node();
		this.count = 0;
	}
	
	public void append(int n) {
		Node node = new Node(n);
		Node temp = head;
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(node);
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
		Node prev;
		while(temp.getNext() != null) {
			prev = temp;
			temp = temp.getNext();
			if(temp.getData() == d) {
				prev.setNext(temp.getNext());
				System.out.println("Deleted "+ temp);
				return;
			}
			
		}
		
	}
}
