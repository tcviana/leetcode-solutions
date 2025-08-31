# https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/?

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0

        for i in  range(1, len(prices)):
            result = prices[i] - prices[i-1]

            if result > 0:
                profit += result
        
        return profit
        
