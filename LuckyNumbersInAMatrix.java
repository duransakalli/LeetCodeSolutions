import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInAMatrix {
	public static int num = 2; 
	public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        for (int[] ints : matrix) {
    		int min = Integer.MAX_VALUE, index = -1;
    		for (int j = 0; j < matrix[0].length; j++) {
    			if (min > ints[j]) {
    				min = ints[j];
    				index = j;
    			}
    		}
    		if (isHighestInColumn(index, min, matrix)) {
    			result.add(ints[index]);
    		}
    	}
        return result;
    }
	
	private boolean isHighestInColumn(int index, int num, int[][] arr) {
		int max = Integer.MIN_VALUE;
		for (int[] ints : arr) {
			if (ints[index] > max)
				max = ints[index];
		}
		return max == num;
	}
}
