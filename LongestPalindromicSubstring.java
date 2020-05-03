
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int left = 0, right = 0;
        int i = 0;
        int j = s.length()-1;
        String result = "";
        while(j > i) {
        	if((s.charAt(i) == s.charAt(j)) && (left == 0 && right == 0)) {
        		left = i;
        		right = j;
        		i++;
        		j++;
        	} else {
        		left = 0;
        		right = 0;
        		i++;
        		j++;
        	}
        }
        if(s.length() == 1)
            return s;
        if(s.length() == 2)
            return s.substring(0,1);
        if(left == 0 && right == 0)
        	return "";
        for(int k = left; k <= right; k++) {
        	result += s.charAt(k);
        }
        return result;
    }
}
