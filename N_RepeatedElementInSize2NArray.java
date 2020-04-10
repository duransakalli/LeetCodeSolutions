import java.util.HashMap;
import java.util.Map;

public class N_RepeatedElementInSize2NArray {
	 public int repeatedNTimes(int[] A) {
	        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	        
	        for(int n : A) 
	        	if(map.containsKey(n))
	        		map.put(n, map.get(n)+1);
	        	else
	        		map.put(n, 1);
	        int result = A.length/2;
	        int key = 0;
	        for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
	        { 
	            if(entry.getValue() == result) 
	            	key = entry.getKey();
	        } 
	        	return key;
	        
	    }
}
