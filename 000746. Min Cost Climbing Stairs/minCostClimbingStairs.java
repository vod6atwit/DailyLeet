class Solution {
  public int minCostClimbingStairs(int[] cost) {
    for (int i = cost.length - 3; i >= 0; i--) {
      cost[i] += Math.min(cost[i + 1], cost[i + 2]);
    }
    return Math.min(cost[0], cost[1]);
  }
}

// [10,15,20]
// [min(10+15,10+20), 15, 20] = [25, 15, 20]
// min([0], [1]) = min(25, 15) = 15

// Runtime : 0 ms - Beats: 100%
// Memory : 42.8 MB - Beats: 86.96%
// Link submission:
// https://leetcode.com/problems/min-cost-climbing-stairs/submissions/1034412616/