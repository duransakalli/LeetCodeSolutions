import java.util.Arrays;

public class SquaresOfASortedArray {
	 public int[] sortedSquares(int[] A) {
		 /*
		 int[] result = new int[A.length];
		 for(int i = 0; i < A.length;i++)
			 result[i] = (int)Math.pow(A[i], 2);
		 Arrays.sort(result);
		 return result;
		 */
		 
		 int[] result = new int[A.length];
		 int left = 0;
		 int right = A.length-1;
		 int index = A.length-1;
		 
		 while(left < right) {
			 if(Math.pow(A[left], 2) < (Math.pow(A[right], 2))) {
				 result[index] = (int)Math.pow(A[right], 2);
				 right--;
			 } else {
				 result[index] = (int)Math.pow(A[left], 2);
				 left++;
			 }				 			
			 index--;			
		 }
		 
		 if(left == right)
			 result[0] = (int)Math.pow(A[left], 2);
		 return result;		 
	   }
}
