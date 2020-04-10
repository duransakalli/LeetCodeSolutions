import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<Integer>();
        
        for(int n : nums1)
        	map.put(n,map.getOrDefault(n, 0)+1);
        
        
        for(int n : nums2) {
        	if(map.containsKey(n)) {
        		list.add(n);
        		map.remove(n);
        	}
        }
        int[] result = new int[list.size()];
        
        for(int i = 0; i < result.length;i++)
        	result[i] = list.get(i);
        
       return result;
        	
        
    }
}
