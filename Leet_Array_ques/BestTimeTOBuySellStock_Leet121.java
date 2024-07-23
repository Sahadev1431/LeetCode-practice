public class BestTimeTOBuySellStock_Leet121 {
    public int maxProfit(int[] prices) {
        // [7,1,5,3,6,4]
        // [7,6,4,3,1]
        int low = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int cost = prices[i] - low;
            profit = Math.max(profit,cost);
            low = Math.min(prices[i], low);
        }
        return profit;
    }
}
