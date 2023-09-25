class Solution {
  public int maxProfit(int[] prices) {
    int profit = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] > prices[i - 1]) {
        profit += prices[i] - prices[i - 1];
      }
    }
    return profit;
  }
}

// Runtime : 1ms - Beats: 85.3%
// Memory : 44MB - Beats: 78.38%
// Link submission:
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/submissions/1058299216