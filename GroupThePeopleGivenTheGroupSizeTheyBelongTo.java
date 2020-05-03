import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupThePeopleGivenTheGroupSizeTheyBelongTo {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
       
    	List<List<Integer>> mainList = new ArrayList<List<Integer>>();
    	Map<Integer, List> map = new HashMap<Integer, List>();
        
    	for(int i = 0; i < groupSizes.length; i++) {
    		
    		List<Integer> temp = map.getOrDefault(groupSizes[i], new ArrayList<>());
    		
    		temp.add(i);
    		
    		if(temp.size() == groupSizes[i]) {
    			map.remove(groupSizes[i]);
    			mainList.add(temp);
    		} else 
    			map.put(groupSizes[i], temp);    		
    	}
    	return mainList;
        
    }
}
