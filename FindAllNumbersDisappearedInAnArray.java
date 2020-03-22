import java.util.*;

public class FindAllNumbersDisappearedInAnArray {

	 public List<Integer> findDisappearedNumbers(int[] nums) {	        
		 
		 	List<Integer> list = new ArrayList<Integer>();
		 	Set<Integer> set = new TreeSet<Integer>();		 	
		 	Arrays.sort(nums);
		 	
		 	for(int num : nums)
		 		set.add(num);
		 	
		 	for(int i = 0; i < nums.length;i++)
		 		if(!set.contains(i+1))
		 			list.add(i+1);
		 	return list;
	    }

}
