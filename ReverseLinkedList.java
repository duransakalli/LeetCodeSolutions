import java.util.Stack;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }

public class ReverseLinkedList {
	 public ListNode reverseList(ListNode head) {
		 
		 ListNode previous = null;
		 ListNode currentNext = null;
		 ListNode current = head;
		 
		 while(current != null)
		 {
			 currentNext = current.next;
			 current.next = previous;
			 previous = current;
			 current = current.next;
		 }
		 return previous;
	    }
}
