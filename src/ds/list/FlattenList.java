package ds.list;

public class FlattenList {
	


	public static void main(String[] args) {
		

	}
	
	public ListNode flattenedList(ListNode src) {
		
		ListNode result = null;
		ListNode nextNode = null;
		ListNode temp = src;
		while(temp.next != null || temp.down != null) {
			ListNode down = null;
			if(temp.down != null) {
				down = flattenedList(temp.down);
			}
			if(result == null) {
				nextNode = new ListNode(temp.value);
				
			}
			else {
				nextNode = new ListNode(temp.value);
			}
		}
		return null;
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
