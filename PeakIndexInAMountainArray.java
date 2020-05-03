
public class PeakIndexInAMountainArray {
    public int peakIndexInMountainArray(int[] A) {
        int peak = 0;
        for(int i = 1; i < A.length; i++) {
        	if(A[i] > A[i-1])
        		peak = i;
        }
        return peak;
    }
}
