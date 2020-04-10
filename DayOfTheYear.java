import java.util.HashMap;
import java.util.Map;

public class DayOfTheYear {
	public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));
        
        int total = 0;
        int monthDays = 0;    
        
        Map <Integer, Integer> dayOfMonth= new HashMap<Integer, Integer>();
        
        dayOfMonth.put(1,31);
        dayOfMonth.put(2,28);
        dayOfMonth.put(3,31);
        dayOfMonth.put(4,30);
        dayOfMonth.put(5,31);
        dayOfMonth.put(6,30);
        dayOfMonth.put(7,31);
        dayOfMonth.put(8,31);
        dayOfMonth.put(9,30);
        dayOfMonth.put(10,31);
        dayOfMonth.put(11,30);
        
        if(month == 1)
        	monthDays=0;
        else {
        	 for(int i=month; i>=2; i--){
        	        monthDays+=dayOfMonth.get(i-1);
        	 }
        }
        total=monthDays+day;
        if(month >= 3 && isLeap(year))
        	total++;
        return total;
    }
	
	public boolean isLeap(int year) {
		if(year%100==0 && year%400!=0)
			return false;
		else if(year%4==0)
			return true;
		return false;
	}
}
