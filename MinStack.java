import java.util.ArrayList;
import java.util.Stack;

public class MinStack {
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();
	
    public MinStack() {
    }
    
    public void push(int x) {
    	stack.push(x);
    	if(minStack.empty())
    		minStack.push(x);
    	else 
    		minStack.push(x > minStack.peek() ? minStack.peek() : x );
    		
    }
    
    public void pop() {
    	if(!stack.empty()) {
    		stack.pop();
    		minStack.pop();
    	}
    }
    
    public int top() {
     return stack.peek();
    }
    
    public int getMin() {
    	return minStack.peek();
    }
}
