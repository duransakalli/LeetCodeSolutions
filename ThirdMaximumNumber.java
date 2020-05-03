import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int n : nums) {
        	set.add(n);
        	if(set.size() > 3)
        		set.remove(Collections.min(set));
        }
        
        if(set.size() == 3)
        	return Collections.min(set);
        else
        	return Collections.max(set);
    }
}
