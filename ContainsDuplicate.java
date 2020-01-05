import java.util.HashSet;

public class ContainsDuplicate {
	
	 public boolean containsDuplicate(int[] nums) {
		 
		 
		 /*
		 for(int i = 0; i < nums.length; i++)
	        {
	        	for(int j = i+1; j < nums.length; j++)
	        	{
	        		if(nums[i] == nums[j])
	        		{
	        			return true;
	        		}
	        	}
	        }
		 return false;
		 */
		 
		 // 2nd Solution
		 HashSet<Integer> set = new HashSet<Integer>();
		 
		 for(Integer num : nums)
		 {
			 set.add(num);
		 }
		 
		 if(set.size() < nums.length) 
			 return true;
		
		 return false;
		 
	    }
}
