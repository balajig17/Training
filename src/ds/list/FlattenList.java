package ds.list;

public class FlattenList {

	private ListNode curr = null;
	private ListNode head;

	public FlattenList() {
		head = new ListNode('0');
		curr = head;
	}

	public static void main(String[] args) {
		
		FlattenList fl = new FlattenList();
		ListNode list = createList();
		printList(list);
		list = fl.flattenedList(list);
		printList(list);

	}
	
	public static ListNode createList() {
		ListNode head = new ListNode('A');
		ListNode temp = head;
		temp.next = new ListNode('B');
		temp = temp.next;
		temp.next = new ListNode('C');
		temp = temp.next;
		temp.next = new ListNode('D');
		temp = temp.next;
		temp.down = createSubList();
		temp.next = new ListNode('E');
		temp = temp.next;
		temp.next = new ListNode('F');
		return head;
	}
	
	public static ListNode createSubList() {
		ListNode head = new ListNode('G');
		ListNode temp = head;
		temp.next = new ListNode('H');
		temp = temp.next;
		temp.next = new ListNode('I');
		temp.down = new ListNode('K');
		temp.down.next = new ListNode('L');
		temp = temp.next;
		temp.next = new ListNode('J');
		return head;
	}
	
	public static void printList(ListNode head) {
		while(head != null) {
			System.out.println(head.value);
			head = head.next;
		}
	}

	public ListNode flattenedList(ListNode src) {

		ListNode temp = src;
		while (temp != null) {
			if (temp.down != null) {
				flattenedList(temp.down);
			}
			curr.next = new ListNode(temp.value);
			curr = curr.next;
			temp = temp.next;
		}
		return head.next;
	}

}

class ListNode {

	ListNode next = null;
	ListNode down = null;
	char value;

	public ListNode(char c) {
		this.value = c;
	}

}
