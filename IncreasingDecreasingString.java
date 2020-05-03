import java.util.HashMap;
import java.util.Map;

public class IncreasingDecreasingString {

	public String sortString(String s) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			Integer count = (int) s.charAt(i) - 97; // a to z -> 0 - 25
			if (map.containsKey(count))
				map.put(count, map.get(count) + 1);
			else
				map.put(count, 1);
		}

		while (!map.isEmpty()) {
			for (int i = 0; i <= 25; i++) {
				if (map.containsKey(i)) {
					if (map.get(i) == 1) {
						sb.append((char) i + 97);
						map.remove(i);
					} else {
						sb.append((char) i + 97);
						map.put(i, map.get(i) - 1);
					}
				}
			}
			
			for(int i = 25; i >= 0; i++) {
				if(map.containsKey(i)){
					if(map.get(i)==1) {
						sb.append((char) i + 97);
						map.remove(i);
					} else {
						sb.append((char) i + 97);
						map.put(i, map.get(i) - 1);
					}
				}
			}
		}
		return sb.toString();
	}

}
