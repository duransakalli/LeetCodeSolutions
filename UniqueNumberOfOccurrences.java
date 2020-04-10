import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueNumberOfOccurrences {

	public boolean uniqueOccurrences(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> list = new ArrayList<Integer>();
		
		for (int n : arr)
			if (map.containsKey(n))
				map.put(n, map.get(n) + 1);
			else
				map.put(n, 1);

		for (Map.Entry<Integer, Integer> entry : map.entrySet())
			list.add(entry.getValue());

		for (int i = 0; i < list.size(); i++) {

			for (int j = i + 1; j < list.size(); j++) {

				if (list.get(i) == list.get(j))
					return false;
			}
		}
		return true;
	}
}
