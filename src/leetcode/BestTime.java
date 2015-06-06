package leetcode;

public class BestTime {
	public int maxProfit(int[] prices){
		int lowestPrice = 0;
		int maxProfit = 0;
		if(prices.length > 0){
			lowestPrice = prices[0];
			for(int i = 0; i<prices.length;i++){
				if(lowestPrice > prices[i])
					lowestPrice = prices[i];
				maxProfit = Math.max(maxProfit, prices[i] - lowestPrice);
			}
		}
		return maxProfit;
	}
}
