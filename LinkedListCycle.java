import java.util.HashSet;

public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
	     	ListNode currrent = head;
	        HashSet<ListNode> mySet = new HashSet<ListNode>();
	        
	        if(head == null || head.next == null) return false;
	        
	        while(currrent != null) {
	            if(mySet.contains(currrent))
	                return true;
	            else
	            	mySet.add(currrent);
	            currrent = currrent.next;
	        }
	        return false;
	}
}
