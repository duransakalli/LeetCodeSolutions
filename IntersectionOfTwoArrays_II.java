import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArrays_II {

	public int[] intersect(int[] nums1, int[] nums2) {

		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();

		for (int i : nums1)
			myMap.put(i, myMap.getOrDefault(i, 0) + 1);

		List<Integer> myList = new ArrayList<Integer>();

		for (int i : nums2) {
			int val = myMap.getOrDefault(i, 0);

			if (val > 0) {
				myList.add(i);
				myMap.put(i, val - 1);
			}
		}

		int[] result = new int[myList.size()];

		for (int i = 0; i < myList.size(); i++)
			result[i] = myList.get(i);

		return result;
	}
}
