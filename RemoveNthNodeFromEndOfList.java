class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 
public class RemoveNthNodeFromEndOfList {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
		 int size = 0;
	        ListNode curr = head;
	        while(curr!=null){
	            size++;
	            curr = curr.next;
	        }
	        curr = head;
	        ListNode temp = null;
	        int diff = size - n;
	        while(diff>0){
	            temp = curr;
	            curr = curr.next;
	            diff--;
	        }
	        if(temp == null){
	            head = curr.next;
	            return head;
	        }
	        temp.next = curr.next;
	        return head;
	    }
}
