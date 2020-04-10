import java.util.HashMap;
import java.util.Map;

public class FindWordsThatCanBeFormedByCharacters {
	public int countCharacters(String[] words, String chars) {
		int result = 0;
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] c = chars.toCharArray();
		
		for(int i = 0; i < c.length; i++)
			map.put(c[i], 1);
		
		
		for(int i = 0; i < words.length; i++) {
			char[] temp = words[i].toCharArray();
			boolean flag = false;
			for(int j = 0; j < temp.length;j++) {
				if(map.containsKey(temp[j]))
					flag = true;
				else {
					flag = false;
					break;
				}
					
			}
			if(flag)
				result += temp.length;			
		}
		return result;
	}
}
