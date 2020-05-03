
public class GuessNumberHigherOrLower {
	   public int guessNumber(int n) {
	        int low = 0;
   int high = n;
   
   while(high >= low) {
   	int mid = ((high - low) / 2)  + low;
   	if(guess(mid)==1)
   		low = mid+1;
   	else if(guess(mid)==-1)
   		high = mid-1;
   	else
   		return mid;
   }
   return low;
	    }
}
