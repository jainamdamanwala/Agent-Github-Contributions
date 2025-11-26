# Best Time to Buy and Sell Stock
# Difficulty: Medium
# URL: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

def maxProfit(prices, fee): 
  buy = -prices[0] if prices else 0
  sell = 0
  for price in prices:
    new_buy = max(buy, sell - price)
    new_sell = max(sell, buy + price - fee)
    buy, sell = new_buy, new_sell
  return sell
