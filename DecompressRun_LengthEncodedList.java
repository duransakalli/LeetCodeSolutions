import java.util.ArrayList;

public class DecompressRun_LengthEncodedList {
	public int[] decompressRLElist(int[] nums) {
	       ArrayList<Integer> list = new ArrayList<Integer>();
	        
	        for(int i = 1; i < nums.length; i+=2) {
	        	int freq = i - 1;
	        	for(int j = 0; j < nums[freq]; j++) {
	        		list.add(nums[i]);
	        	}            
	        }
	        
	        int[] arr = new int[list.size()];
	        for(int i = 0; i < arr.length; i++) {
	        	arr[i] = list.get(i);
	        }
	        return arr;
    }
}
