
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        
        int count = 0;
        
        while(i >= 0 || j >= 0) {
        	int sum = count + (i >= 0 ? a.charAt(i) - '0' : 0) + (j >= 0 ? a.charAt(j) - '0' : 0);
        	sb.append(sum%2);
        	count = sum /2;
        	i--;
        	j--;
        }
        
        if(count == 1)
        	sb.append(1);
        
        sb.reverse();
        return sb.toString();
    }
}
