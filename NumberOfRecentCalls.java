import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls {
    Queue<Integer> call = new LinkedList<Integer>();
	public RecentCounter() {
        
    }
    
    public int ping(int t) {
        call.offer(t);
        while(call.peek() < (t - 3000)) {
        	call.poll();
        }
        return call.size();
    }
}
