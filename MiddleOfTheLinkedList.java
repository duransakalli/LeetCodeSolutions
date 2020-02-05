
public class MiddleOfTheLinkedList {

	public ListNode middleNode(ListNode head) {
		/*
		int size = 1;
		ListNode temp = head;
		
		if (head.next == null)
			return head;
		//find size of list
		while (temp != null) {
			temp = temp.next;
			size++;
		}
		
		// find middle of list
		if (size % 2 == 0)
			size /= 2;
		else
			size = (size + 1) / 2;

		temp = head;
		while (size > 1) {
			temp = temp.next;
			size--;
		}
		return temp;
		*/
		
		// ALTERNATIVE SOLUTION
		ListNode tempSingle = head;
		ListNode tempDouble = head;
		
		if (head.next == null)
			return head;
		
		while(tempDouble.next != null && tempDouble.next.next != null) {			
			tempSingle = tempSingle.next;
			tempDouble = tempDouble.next.next;
		}
        if(tempDouble.next != null)
				tempSingle = tempSingle.next;
		return tempSingle;
    }
		
	
}
