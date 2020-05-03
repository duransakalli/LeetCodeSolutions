
public class N_th_TribonacciNumber {
    public int tribonacci(int n) {
    	if(n == 0)
    		return 0;
    	
    	int x = 0, y = 1, z = 1;
    	
    	for(int i = 3; i <= n; i++) {
    		int num = x + y + z;
    		x = y;
    		y = z;
    		z = num;
    	}
    	return z;
    }
}
