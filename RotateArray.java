import java.util.Arrays;
import java.util.Collections;

public class RotateArray {

	public void rotate(int[] nums, int k) {
     
		int[] temp = (int[]) nums.clone();
		int l = temp.length - k, n = temp.length - k;		
		int m = k;
		
		 if (nums == null || nums.length == 0) { return;
	        }
		
		for(int i = 0; i < k; i++)
		{
			nums[i] = temp[temp.length - m];
			m--;
		}
		
		for(int i = 0; i < n; i++)
		{
			nums[l-1] = temp[i];
			l++;
		}
    }
}
