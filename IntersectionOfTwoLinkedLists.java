import java.util.ArrayList;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    
    	reverse(headA);
    	reverse(headB);
    	
    	ListNode tempB = headB;
    	ListNode tempA = headA;	
    	ListNode temp = null;
    	
    	while(tempB != null && tempA != null)
    	{
    		if(tempA.val == tempB.val)
    			temp = tempA;
    		tempA = tempA.next;
    		tempB = tempB.next;
    	}
    	return temp;
    }
    
    public ListNode reverse(ListNode head)
    {
    	ListNode previous = null;
    	ListNode next = null;
    	ListNode current = head;
    	
    	while(current != null)
    	{
    		next = current.next;
    		current.next = previous;
    		previous = current;
    		current = next;
    	}
    	head = previous;
    	return head;
    }
}
