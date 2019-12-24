
public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) { 
		if(nums.length == 0) return 0;
		
	    int i = 1;
        int j = 0;
        
        for (i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                j++;
                nums[j] = nums[i];
                
            }
        }
        return j + 1;
    }	
}
