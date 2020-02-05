

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
		
		/*
		Map<Character, Character> characters = new HashMap<>();
		characters.put('(', ')');
		characters.put('{', '}');
		characters.put('[', ']');

		Stack<Character> stack = new Stack<>();

		for (char bracket : s.toCharArray()) {
			if (characters.containsKey(bracket)) {
				stack.push(bracket);
			} else {
				if (stack.isEmpty() || characters.get(stack.pop()) != bracket)
					return false;
			}
		}
		return stack.isEmpty();
		*/
		
		
		// ALTERNATIVE SOLUTION
		
		if(s.length() == 0) return true;
		
		Stack<Character> myStack = new Stack<Character>();
		
		for(Character c : s.toCharArray())
		{
			switch(c) {
			case '(':
				myStack.push(c);
				break;
			case '{':
				myStack.push(c);
				break;
			case '[':
				myStack.push(c);
				break;
			   case ')':
                   if (myStack.isEmpty() || myStack.pop() != '(') return false;
                   break;
               case ']':
                   if (myStack.isEmpty() || myStack.pop() != '[') return false;
                   break;
               case '}':
                   if (myStack.isEmpty() || myStack.pop() != '{') return false;
                   break;
               default:
                   return false;
			}			
		}
		return myStack.isEmpty();
	}
}
