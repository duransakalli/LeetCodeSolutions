
public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int result = sum(l1) + sum(l2);
        ListNode res = null;
        while(result > 0) {
        	res.val = result % 10;
        	result /= 10;
        	res = res.next;
        }
        return res;
        
    }
	
	public int sum(ListNode list) {
		int sum = 0;
		while(list != null) {
			sum *= 10;
			sum += list.val;
			list = list.next;
		}
		sum *= 10;
		return sum;
	}

}
