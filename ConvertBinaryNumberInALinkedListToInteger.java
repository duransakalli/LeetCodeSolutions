
public class ConvertBinaryNumberInALinkedListToInteger {
	public int getDecimalValue(ListNode head) {
		ListNode node = head;
        int i = 0;
        while (node != null) {
            i++;
            node = node.next;
        }
        node = head;
        int total = 0;
        while (node != null) {
            total = total + node.val * (int)(Math.pow(2, --i));
            node = node.next;
        }
        return total;
        
        
        /* ALTERNATIVE SOLUTION
        int total = 0;
		ListNode node = head;
        int i = 0;
        while (node != null) {
            i++;
            node = node.next;
        }
        node = head;
        while(node != null) {
        	total = total + (node.val<<--i);
            node = node.next;
        }        
        return total;
         */
    }
}
