
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class DeleteNodeInALinkedList {

	public void deleteNode(ListNode node) {

		while (true) {
			node.val = node.next.val;

			if (node.next.next == null) {
				node.next = null;
				return;
			}
			node = node.next;
		}
	}
}
