import java.util.Arrays;
import java.util.Collections;

public class SortArrayByParity {
	public int[] sortArrayByParity(int[] A) {
		int i = 0, j = A.length - 1, temp;
		
		while (i < j) {
			if (A[i] % 2 != 0 && A[j] % 2 == 0) {
				temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				i++;
				j--;
			} else if (A[i] % 2 != 0 && A[j] % 2 != 0) {
				j--;
			} else if (A[i] % 2 == 0 && A[j] % 2 == 0) {
				i++;
			} else {
				i++;
				j--;
			}
		}
		return A;
	}
}
