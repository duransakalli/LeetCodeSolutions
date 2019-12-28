
public class BestTimeToBuyAndSellStock {

	public static int maxProfit(int[] prices) {

		int profit = 0, result = 0;

		for (int i = 0; i < prices.length - 1; i++) {

			for (int j = i + 1; j < prices.length; j++) {
				profit = prices[j] - prices[i];
				if (profit > result) {
					result = profit;
				}
			}
		}
		return result;
	}
}
