
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }

public class PalindromeLinkedList {
public boolean isPalindrome(ListNode head) {
	
	
	
	if(head == null || head.next == null)
			return true;
	
	ListNode first = head;
	ListNode secondHead = splitList(head).next;
	ListNode newSecondHead = reverseList(secondHead); 
	
	while(newSecondHead != null)
	{
		if(first.val != newSecondHead.val)
			return false;
		first = first.next;
		newSecondHead = newSecondHead.next;
	}
	
	return true;
		
    }


public ListNode reverseList(ListNode head) {
    ListNode previous = null;
	 ListNode currentNext = null;
	 ListNode current = head;
	 
	 while(current != null)
	 {
		 currentNext = current.next;
		 current.next = previous;
		 previous = current;
		 current = currentNext;
	 }
   return previous;
}

private static ListNode splitList(ListNode head) {
	ListNode second = head.next, first = head;
    while(second != null && second.next != null) {
    	first = first.next;
    	second = second.next.next;
    }
    return first;
}

}
