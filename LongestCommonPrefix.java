
public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0)	return "";
		
		String pivot = strs[0];

		for (int i = 1; i < strs.length; i++) 
		{
			while (strs[i].indexOf(pivot) != 0) 
			{
				pivot = pivot.substring(0, pivot.length() - 1);
				if (pivot.isEmpty())
					return "";
			}
		}
		return pivot;
	}
}
