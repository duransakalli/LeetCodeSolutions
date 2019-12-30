
public class SubtractTheProductAndSumOfDigitsOfAnInteger {
	 public int subtractProductAndSum(int n) {
	        
		 int num;
		 int sum = 0,multi = 1;
		 
		 while(n > 0)
		 {
			 num = n % 10;
			 sum += num;
			 multi *= num;
			 n = n / 10;
		 }
		 return multi - sum;
	    }
}
