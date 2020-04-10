
public class SumOfSquareNumbers {
	
	 public boolean judgeSquareSum(int c) {
	 
		 int left = 0;
		 int right = (int)Math.sqrt(c);
		 
		 while(right >= left) {
			 int result = left * left + right * right;
			 if(c == result)
				 return true;
			 else if(result < c)
				 left++;
			 else
				 right--;
		 }
		 return false;
	 }
	
}
