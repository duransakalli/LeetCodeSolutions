
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */

public class RemoveDuplicatesFromSortedList {
	public ListNode deleteDuplicates(ListNode head) {

		ListNode current = head;

		if (head == null)
			return null;

		while (current.next != null) {
			if (current.next.val == current.val) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
		return head;
	}
}
