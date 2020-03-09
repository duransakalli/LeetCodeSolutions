import java.util.HashMap;
import java.util.Map;

public class LemonadeChange {
	 public boolean lemonadeChange(int[] bills) {
	        /*
		 int[] cash = new int[2];
		 
		 for(int i = 0; i < bills.length; i++)
		 {
			 if(bills[i] == 5)
				 cash[0]++;
			 
			 if(bills[i] == 10)
			 {
				 if(cash[0] == 0)
					 return false;
				 
				 cash[0]--;
				 cash[1]++;
			 }
			 
			 if(bills[i] == 20)
			 {
				 if(cash[0] > 0 && cash[1] > 0)
				 {
					 cash[0]--;
					 cash[1]--;
				 } else if(cash[0] > 2)
				 {
					 cash[0] -= 3;
				 } else
				 {
					 return false;
				 }				 
			 }		 
		 }
		 return true;
		 */
		 
		 // Alternative Solution
		 
		 Map<String, Integer> cash = new HashMap<String, Integer>();
		 cash.put("five", 0);
		 cash.put("ten", 0);
		
		 for(Integer i : bills)
		 {
			 if(bills[i] == 5)
			 {
				 cash.put("five", cash.get("five")+1);
			 } else if (bills[i] == 10)
			 {
				 if(cash.get("five") <= 0)
					 return false;
				 
				 cash.put("five", cash.get("five")-1);
				 cash.put("ten", cash.get("ten")+1);
			 } else
			 {
				 if(cash.get("five") < 1)
					 return false;
				 
				  if (cash.get("ten") < 1)    {
	                    if (cash.get("ten") < 1 && cash.get("five") >= 3)    {
	                    	cash.put("five", cash.get("five") - 3);
	                        continue;
	                    }
	                    else {
	                       return false; 
	                    }                 
	                }
				  
				  cash.put("five", cash.get("five") - 1);
				  cash.put("ten", cash.get("ten") - 1);
			 }
			 
			 
		 }
		 return true;
		 
	    }

}
