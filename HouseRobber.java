
public class HouseRobber {
	public static int rob(int[] nums) {
		int x = 0, y = 0;
		for (int i = 0; i < nums.length; i++) {
			int foo = x;
			x = Math.max(y + nums[i], x);
			y = foo;
		}
		return x;
	}

}
