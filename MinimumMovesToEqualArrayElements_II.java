import java.util.Arrays;

public class MinimumMovesToEqualArrayElements_II {
    public int minMoves2(int[] nums) {
    	Arrays.sort(nums);
    	int mid = nums[nums.length / 2];
    	int diff = 0;
    	
    	for(int i : nums)
    		diff += Math.abs(i - mid);
    	
    	return diff;
    }
}
