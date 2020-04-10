
public class BinarySearch {
	public int search(int[] nums, int target) {
		int min = 0;
		int max = nums.length-1;
		
		while(max >= min) {
			int mid = min + (max-1) / 2;
			
			if(nums[mid] == mid)
				return mid;			
			else if(nums[mid] < target)
				min = mid + 1;			
			else
				max = mid-1;						
		}
		return -1;
    }
}
