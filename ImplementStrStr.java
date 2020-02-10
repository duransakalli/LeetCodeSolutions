
public class ImplementStrStr {
	public int strStr(String haystack, String needle) {
		
		if(needle.contains(needle))
			return haystack.indexOf(needle);
		
		return -1;
    }
}
