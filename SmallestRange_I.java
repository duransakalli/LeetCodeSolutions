
public class SmallestRange_I {
    public int smallestRangeI(int[] A, int K) {
        int min = A[0];
        int max = A[0];
        
        for(int i : A) {
        	if(max < i) max = i;
        	if(min > i) min = i;
        }
        
        int diff = max - min;
        return diff <= 2 * K ? 0 : diff - 2 * K;
    }
}
