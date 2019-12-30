
public class DefangingAnIPAddress {
	public String defangIPaddr(String address) {
        
		String result = "";
		
		for(int i = 0; i < address.length(); i++)
        {
        	
        	if(address.charAt(i) == '.')
        	{
        		result += "[.]";
        		continue;
        	}
        	
        	
        	result += address.charAt(i);
        }
		return result;
    }
}
