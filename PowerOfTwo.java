
public class PowerOfTwo {
	public boolean isPowerOfTwo(int n) {
		if (n == 1)
			return true;
		while (n > 0) {
			if (n % 2 == 0) {
				n /= 2;

				if (n == 1)
					return true;
			} else
				return false;
		}
		return false;
	}

}
