import java.util.HashMap;
import java.util.Map;

public class FindLuckyIntegerInAnArray {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = -1;
        for(int a : arr) {
        	Integer val = map.get(a);
        	if(map.containsKey(a))
        		map.put(a, val+1);
        	else
        		map.put(a, 1);
        }
        
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] == map.get(arr[i])) {
        		if(max < arr[i])
        			max = arr[i];
        		}
        }
        
        return max;
    }
}
