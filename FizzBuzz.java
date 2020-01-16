import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	 public List<String> fizzBuzz(int n) {
	        List<String> list = new ArrayList<String>();
	        
	        for(int i = 1; i <= n; i++)
	        {
	        	int fizz = i;
	        	String s = Integer.toString(i);
	        	
	        	if(fizz % 3 == 0 && fizz % 5 == 0)
	        		s = "FizzBuzz";
	        	else if(fizz % 3 == 0)
	        		s = "Fizz";
	        	else if(fizz % 5 == 0)
	        		s = "Buzz";
	        	
	        	list.add(s);
	        }
	        return list;
	    }
}
