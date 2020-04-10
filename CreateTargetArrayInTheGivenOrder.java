import java.util.ArrayList;
import java.util.List;

public class CreateTargetArrayInTheGivenOrder {
	public int[] createTargetArray(int[] nums, int[] index) {
		List<Integer> resultList = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++)
			resultList.add(index[i], nums[i]);

		int[] array = resultList.stream().mapToInt(i -> i).toArray();
		return array;
	}
}
