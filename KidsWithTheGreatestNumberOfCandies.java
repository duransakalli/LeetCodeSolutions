import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<Boolean>();
        int max = candies[0];
        for(int i : candies)
        	if(i > max)
        		max = i;
        for(int i : candies) 
        	list.add(max <= i+extraCandies);
        return list;         	
    }
}
