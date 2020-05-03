
public class ArrangingCoins {
    public int arrangeCoins(int n) {
        int count = 0;
        while(n > count) {
        	count++;
        	n -= count;
        }
        return count;
    }
}
