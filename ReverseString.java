
public class ReverseString {
	 public void reverseString(char[] s) {
	     
	   	 char[] t = s.clone();
		 
			 int count = 0;
			 for(int i = s.length-1; i >= 0; i--)
			 {
				 s[count] = t[i];
				 count++;
			 }	 
	    }
}
