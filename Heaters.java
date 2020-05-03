import java.util.Arrays;

public class Heaters {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        Arrays.sort(houses);
        
        int rad = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        int i = 0, j = 0; 
        
        while(i < houses.length) {
        	while(houses[i] >= heaters[j]) {
        		rad = houses[i] - heaters[j];
        		j++;
        		if(j == heaters.length)
        			return Math.max(max, houses[houses.length-1] - heaters[heaters.length-1]);
        	}
        	rad = Math.min(rad, heaters[j] - houses[i]);
        	max = Math.max(max, rad);
        	i++;   
        	if(i != houses.length)
        		rad += houses[i] - houses[i-1];
        }
        return max;
    }
}

