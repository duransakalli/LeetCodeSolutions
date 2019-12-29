import java.util.Arrays;

public class ValidAnagram {
	 public boolean isAnagram(String s, String t) {
	        
		 char[] As = new char[s.length()];
		 char[] At = new char[t.length()];
		 
		 for(int i = 0; i < s.length(); i++)
		 {
			 As[i] = s.charAt(i);
		 }
		 
		 for(int i = 0; i < t.length(); i++)
		 {
			 At[i] = t.charAt(i);
		 }
		 
		 Arrays.sort(As);
		 Arrays.sort(At);
		 
		 if(Arrays.equals(As, At))
		 {
			 return true;
		 } else
		 {
			 return false;
		 }
		 
	    }
}
