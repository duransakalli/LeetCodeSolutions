
public class FactorialTrailingZeroes {

	public int trailingZeroes(int n) {
        int count = 0;
        int num = factorial(n);
        while(num != 0) {
        	if(num % 10 == 0) {
        		count++;
        		num /= 10;
        	} else break;
        }
        return count;
    }
	
	public static int factorial(int n) {
		if(n <= 0)
			return 1;
		return n * factorial(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

}
