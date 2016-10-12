/**
 * 
 */
package problems;

import java.awt.List;

/**
 * @author Balaji Gurumurthy
 *
 */
public class SumOfLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(9);
		l1.next = new ListNode(9);
		l1.next.next = new ListNode(9);
		
		ListNode l2 = new ListNode(1);
//		l2.next = new ListNode(6);
//		l2.next.next = new ListNode(4);
		
		
		ListNode res = addTwoNumbers(l1, l2);
		System.out.println();
		while(res != null) {
			System.out.print(res.val + " ");
			res = res.next;
		}

	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		int sum = 0;
		ListNode result = null;
		ListNode head = new ListNode(-1);
		result = head;
		while (l1 != null && l2 != null) {

			sum += l1.val;
			sum += l2.val;
			int rem = sum % 10;
			sum = sum / 10;
				result.next = new ListNode(rem);
				result = result.next;
			l1 = l1.next;
			l2 = l2.next;
		}
		
		if(l1 != null || l2 != null) {
			ListNode list = (l1 != null) ? l1 : l2;
			while(list != null) {
				if(sum == 0)
				{
					result.next = list;
					return head.next;
				}
				sum += list.val ;
				int rem = sum % 10;
				sum = sum / 10;
				result.next = new ListNode(rem);
				result = result.next;
				list = list.next;
			}
		}
		
		if(sum != 0) {
				result.next = new ListNode(sum);
		}
		
		return head.next;

	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
