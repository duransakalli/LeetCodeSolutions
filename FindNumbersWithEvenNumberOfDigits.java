
public class FindNumbersWithEvenNumberOfDigits {
	public int findNumbers(int[] nums) {
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			String result = Integer.toString(nums[i]);

			if (result.length() % 2 == 0)
				res++;		
		}
		return res;
	}	
}
