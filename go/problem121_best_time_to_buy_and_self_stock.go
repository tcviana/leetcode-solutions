// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

func maxProfit(prices []int) int {
    profit := 0
    maxProfit := 0
    maxPrice := 10001
    
    for price := range prices {
        
        if price < maxPrice {
            maxPrice = price
        } else {
            profit = price - maxPrice
            
            if (profit > maxProfit) {
                maxProfit = profit
            }
        }
    }

    return maxProfit
    
}
