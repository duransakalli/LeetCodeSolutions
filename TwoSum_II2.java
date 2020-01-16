
public class TwoSum_II2 {
	 public int[] twoSum(int[] numbers, int target) {
	        int low = 0, high = numbers.length-1;
	        
	        while(high >= low)
	        {
	        	if(numbers[low] + numbers[high] == target)
	        		return (new int[] {low + 1, high + 1});
	        	else if(numbers[low] + numbers[high] > target)
	        		high--;
	        	else
	        		low++;
	        }
	        	return new int[]{};	        
	    }
}
