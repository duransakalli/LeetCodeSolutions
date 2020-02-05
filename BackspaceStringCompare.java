
import java.util.Stack;

public class BackspaceStringCompare {

	public boolean backspaceCompare(String S, String T) {
		Stack<Character> stackS = new Stack<Character>();
		Stack<Character> stackT = new Stack<Character>();
		int i;

		for (i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '#') {
				if (!stackS.isEmpty())
					stackS.pop();
			} else {
				stackS.push(S.charAt(i));
			}
		}

		for (i = 0; i < T.length(); i++) {
			if (T.charAt(i) == '#') {
				if (!stackT.isEmpty())
					stackT.pop();
			} else {
				stackT.push(T.charAt(i));
			}
		}

		while (!stackS.isEmpty() && !stackT.isEmpty()) {
			if (stackS.peek() != stackT.peek())
				return false;
			stackS.pop();
			stackT.pop();
		}
		if ((!stackT.empty() && stackS.empty()) || (stackT.empty() && !stackS.empty()))
			return false;
		return true;
	}
}
