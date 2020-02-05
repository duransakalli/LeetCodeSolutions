import java.util.Stack;

public class ImplementQueueUsingStacks {
	private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    public ImplementQueueUsingStacks() {
        this.inStack = new Stack<>();
        this.outStack = new Stack<>();
    }
    
    public void push(int x) {
        inStack.push(x);
    }
    
    public int pop() {
        moveInStackToOutStack();
        return outStack.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        moveInStackToOutStack();
        return outStack.peek();
    }
    
    public boolean empty() {
        return inStack.empty() && outStack.empty();
    }
    
    private void moveInStackToOutStack() {
        if (outStack.empty()) {
            while (!inStack.empty()) {
                int element = inStack.pop();
                outStack.push(element);
            }
        }
    }
}
