import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
	public String removeDuplicates(String S) {
        /*
		while(true) {
            boolean flag = true;
            for(int i=0;i<S.length()-1;i++)
            {
                if(S.charAt(i) == S.charAt(i+1)) {
                	flag = false;
                    S = S.substring(0,i) + S.substring(i+2,S.length());
                }
            }
            if(flag) break;
        }
        return S;
        */
		
		// Alternative Solution
		
		Stack<Character> stack = new Stack<Character>();
		char[] arrChar = S.toCharArray();
		String result = "";
		for(Character c : arrChar) 
		{
			if(!stack.isEmpty() && stack.peek() == c)
				stack.pop();
			else
				stack.push(c);
		}
		
		while(!stack.isEmpty())
		{
			result = stack.pop().toString();			
		};
		return new StringBuilder(result).reverse().toString();
		
    }
}
