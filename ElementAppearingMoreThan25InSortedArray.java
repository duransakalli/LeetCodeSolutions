
public class ElementAppearingMoreThan25InSortedArray {
    public int findSpecialInteger(int[] arr) {
        int max = (arr.length)/4;
    	int count = 1;
        if(arr.length == 1)
            return arr[0];
    	
    	for(int i = 1; i < arr.length; i++) {
    		if(arr[i] == arr[i-1])
    			count++;
    		else
    			count = 1;
    		if(count > max)
    			return arr[i];
    	}
    	return -1;
    }
}
