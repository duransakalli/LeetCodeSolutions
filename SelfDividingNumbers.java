import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = left; i <= right; i++) {
        	if(selfDivide(i))
        		list.add(i);
        }
        return list;
    }
    
    public boolean selfDivide(int number) {
    	int num = number;
    	while(num != 0) {
    		int n = num % 10;
    		if(n == 0 || number % n != 0)
    			return false;
    		num /= 10;
    	}
    	return true;
    }

}
