
public class SortArrayByParity_II {
	 public int[] sortArrayByParityII(int[] A) {
		 
		 int i = 0;
		 int j = 1;
		 
		 while(i < A.length && j < A.length) {
			 if(A[i] % 2 == 0 && A[j] % 2 == 1) {
				 i += 2;
				 j += 2;				 
			 } else if(A[i] % 2 == 1 && A[j] % 2 == 0) {
				 int tem = A[i];
				 A[i] = A[j];
				 A[j] = tem;
				 i += 2;
				 j += 2;				 
			 } else if(A[i] % 2 == 1 && A[j] % 2 == 1) {
				 j += 2;
			 } else if(A[i] % 2 == 0 && A[j] % 2 == 0) {
				 i += 2;
			 }
		 }
		 return A;
		 
	 }
}
