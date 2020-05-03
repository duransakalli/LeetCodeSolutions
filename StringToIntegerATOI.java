
public class StringToIntegerATOI {

	public int myAtoi(String str) {
		int space = 0, sign = 1, res = 0;
		;

		if (Integer.parseInt(str) > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		if (Integer.parseInt(str) < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				space++;
			else
				break;
		}

		if (str.charAt(space) == '-') {
			sign = -1;
			space++;
		}else if (str.charAt(space) == '+') {
			sign = 1;
			space++;
		}else if (!Character.isDigit(str.charAt(space)))
			return 0;

		for (int i = space; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch)) {
				int num = ch - '0';

				if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && num > 7))
					return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

				res = (res * 10) + num;
			}

			else
				break;
		}

		return sign * res;

	}
	
	// second solution
    public int myAtoi1(String str) {
        StringBuilder s = new StringBuilder();
        str = str.trim();
        char[] c = str.toCharArray();
        int result = 0;
        for(Character n : c) {
        	
        	if(Character.isDigit(n) || ((n == '+' || n == '-') && s.length() == 0))
        		s.append(n);
        	else
        		break;
        }
        
        String strng = s.toString();

        
        if(!strng.isEmpty() && !strng.equals("-") && !strng.equals("+")) {
        	try {
        		result = Integer.parseInt(strng);
			} catch (Exception e) {
                if (s.charAt(0) == '-'){
                    result = Integer.MIN_VALUE;
                } else {
                    result = Integer.MAX_VALUE;   
                }
			}
        }
        return result;        
    }

}
