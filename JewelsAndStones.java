
public class JewelsAndStones {
	public int numJewelsInStones(String J, String S) {		
		int count = 0;
		for(Character c : S.toCharArray()) {
			if(J.contains(c.toString()))
				count++;
		}
		return count;
    }
}
