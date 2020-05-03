

public class MinimumMovesToEqualArrayElements {
	public int minMoves(int[] nums) {
		int min = nums[0];
		int sum = 0;
		for (int i : nums) {
			if (min > i)
				min = i;
			sum += i;
		}
		return sum - min * nums.length;
	}
}
