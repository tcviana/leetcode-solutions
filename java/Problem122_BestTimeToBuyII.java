// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for (int i=1; i<prices.length; i++) {
            int result = prices[i]-prices[i-1];

            if (result > 0) {
                profit += result;
            }
        }

        return profit;
    }
}
