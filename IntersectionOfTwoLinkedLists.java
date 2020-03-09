
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		/*
		 * Set<ListNode> set = new HashSet<ListNode>();
		 * 
		 * ListNode temp = headA; while (temp != null) { set.add(temp); temp =
		 * temp.next; }
		 * 
		 * temp = headB;
		 * 
		 * while (temp != null) { if (set.contains(temp)) { break; } temp = temp.next; }
		 * return temp;
		 */

		
		//  ALTERNATIVE SOLUTION
		
		
		int lenA = length(headA);
		int lenB = length(headB);

		while (lenA > lenB) {
			headA = headA.next;
			lenA--;
		}

		while (lenB > lenA) {
			headB = headB.next;
			lenB--;
		}

		while (headA != headB) {
			headA = headA.next;
			headB = headB.next;
		}

		return headA;
	}

	public int length(ListNode head) {
		int count = 0;
		ListNode temp = head;

		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}

}
