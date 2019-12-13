

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {

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
	}
}
