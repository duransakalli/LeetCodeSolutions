
public class Maximum69Number {
	public int maximum69Number (int num) {
		String s = Integer.toString(num);
		char[] c = new char[s.length()];
		boolean flag = false;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '6' && flag == false) {
				c[i] = '9';
				   flag = true;
			} else {
				c[i] = s.charAt(i);
			}
		}
		return Integer.parseInt(String.valueOf(c));
    }
}
