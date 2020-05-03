
public class FibonacciNumber {
    public int fib(int N) {
        if(N == 0 || N == 1)
        	return 1;
        return N + fib(N-1);
    }
    
    public int fib1(int N) {
    	int x = 0, y = 1, z;
        if(N == 0)
            return N;
    	for(int i = 2; i <= N; i++) {
    		z = x + y;
    		x = y;
    		y = z;    		
    	}
    	return y;
    }
}
