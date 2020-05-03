
public class ValidMountainArray {
    public boolean validMountainArray(int[] A) {
        int n = 0 , m = 0;
        
        for(int i = 0; i < A.length-1; i++) {
        	if(A[i] < A[i+1])
        		n++;
        	else break;
        }
        
        for(int i = n; i < A.length-1; i++) {
        	if(A[i] > A[i+1])
        		m++;
        	else
        		break;
        }
        
        if(m+n == A.length-1 && n != 0 && m != 0)
        	return true;
        else
        	return false;
        
    }
}
