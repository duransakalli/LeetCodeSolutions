
public class MoveZeroes {
public static void moveZeroes(int[] nums) {
        
	int[] result = nums.clone();
	
	for(int i = 0; i < result.length; i++)
	{
		nums[i] = 0;
	}
	int count = 0;
	for(int i = 0; i < nums.length; i++)
	{
		if(result[i] != 0)
		{
			nums[count] = result[i];
			count++;			
		}
	}
	
    }
}
