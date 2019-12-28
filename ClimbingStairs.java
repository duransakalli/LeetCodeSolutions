
public class ClimbingStairs {

	public int climbStairs(int n) {

		if (n == 0 || n == 1)
			return 1;
		if (n == 2)
			return 2;
		int x = climbStairs(1), y = climbStairs(2), z = 0;

		for (int i = 0; i < n - 2; i++) {
			z = x + y;
			x = y;
			y = z;
		}

		return z;
	}

}
