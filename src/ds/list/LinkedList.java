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
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(node);
	}

	public void printList() {
		Node temp = head;
		while (temp.getNext() != null) {
			System.out.print(temp.getNext().getData()+" ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	public void deleteNode(int d) {
		Node temp = head;
		Node prev;
		while (temp.getNext() != null) {
			prev = temp;
			temp = temp.getNext();
			if (temp.getData() == d) {
				prev.setNext(temp.getNext());
				System.out.println("Deleted " + temp);
				return;
			}

		}

	}
	
	public void sortList() {
		Node temp = head.getNext();
		Node end = null;
		Node prev = head, next;
		while(temp != end) {
			prev = head;
			while(temp.getNext()!= end) {
				next = temp.getNext();
				if(temp.getData() > next.getData()) {
					temp.setNext(next.getNext());
					next.setNext(temp);
					prev.setNext(next);
					
					temp = prev.getNext(); 
					next = temp.getNext();
				}
				prev = temp;
				temp = temp.getNext();
			}
			
			end = temp;
			temp = head.getNext();
			printList();
		}
	}

	/**
	 * This method deletes a node in a linked list without using head reference.
	 * 
	 * @param node
	 *            - Reference to node to be deleted 
	 *            Assumption: Input node is
	 *            not the last node in the list.
	 */
	public void deleteNode(Node node) {
		// TODO
		Node temp = node.getNext();

	}
}
