
import java.lang.reflect.Array;
import java.util.Arrays;

public class LargestNumberAtLeastTwiceOfOthers {
	 public int dominantIndex(int[] nums) {
	       int big = Integer.MIN_VALUE;	
	       int twice = -1;
	      
	       if(nums.length <= 1) return 0;
	       for (int i = 0; i < nums.length; i ++)
	       {
	    	   if(nums[i] >= big)
	    	   {
	    		   big = nums[i];
	    		   twice = i;
	    	   }
	       }
	       Arrays.sort(nums);
	       if((nums[nums.length-2]) == 0)
         {
             twice = twice;
         }else if((big / nums[nums.length-2] < 2))
	       {
	    	   twice = -1;
	       }
	       return twice;	       
	    } 
	
}
