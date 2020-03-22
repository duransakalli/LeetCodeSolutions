
public class ContainerWithMostWater {
	public int maxArea(int[] height) {
	       int volume = 0, max = 0;
	        int i = 0, j = height.length-1;
	        
	        while(j > i) {
	        	if(height[i] < height[j]) {
	        		volume = height[i] * (j - i);
	        		i++;
	        	}     		
	        	else {        		
	        		volume = height[j] * (j - i); 
	        		j--;
	        	}
	            
	            if(volume > max)
	                max = volume;
	        }
	        return max;
    }
}
