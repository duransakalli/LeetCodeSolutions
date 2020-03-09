import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
		Queue<Integer> queue1;
		Queue<Integer> queue2;
		int top;
	
	  public ImplementStackUsingQueues() {
	        queue1 = new LinkedList<Integer>();
	        queue2 = new LinkedList<Integer>();
	    }
	    
	    /** Push element x onto stack. */
	    public void push(int x) {
	    	queue1.add(x);
	    }
	    
	    /** Removes the element on top of the stack and returns that element. */
	    public int pop() {
	    	while(queue1.size() > 1) {
	    		top = queue1.remove();
	    		queue2.add(top);
	    	}
	    	int result = queue1.remove();
	    	
	    	Queue<Integer> temp = queue1;
	    	queue1 = queue2;
	    	queue2 = temp;
	    	
	    	return result;
	    }
	    
	    /** Get the top element. */
	    public int top() {
	     return top; 
	    }
	    
	    /** Returns whether the stack is empty. */
	    public boolean empty() {
	        return queue1.isEmpty() && queue2.isEmpty();
	    }
}
