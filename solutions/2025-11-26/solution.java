// Best Time to Buy and Sell Stock
// Difficulty: Medium
// URL: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
  public int maxProfit(int[] prices, int fee) {
    if (prices.length == 0) return 0;
    int buy = -prices[0], sell = 0;
    for (int price : prices) {
      int newBuy = Math.max(buy, sell - price);
      int newSell = Math.max(sell, buy + price - fee);
      buy = newBuy;
      sell = newSell;
    }
    return sell;
  }
}