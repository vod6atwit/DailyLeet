class Solution {
  public int maxProfit(int[] prices) {
    int l = 0;
    int r = 1;
    int max = 0;
    while (r < prices.length) {
      if (prices[l] < prices[r]) {
        max = Math.max(max, prices[r] - prices[l]);
      } else {
        l = r;
      }
      r++;
    }
    return max;
  }
}

// Runtime : 1 ms - Beats: 99.92%
// Memory : 60.7 MB - Beats: 80.9%
// Link submission:
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/1034169342/