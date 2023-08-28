class Solution {
  public int tribonacci(int n) {
    int[] memo = new int[3];
    memo[0] = 0;
    memo[1] = 1;
    memo[2] = 1;

    if (n < 3) {
      return memo[n];
    }

    for (int i = 3; i < n + 1; i++) {
      int num = memo[0] + memo[1] + memo[2];
      memo[0] = memo[1];
      memo[1] = memo[2];
      memo[2] = num;
    }

    return memo[2];
  }
}

// 0 1 1 2 4 8

// Runtime : 0ms - Beats: 100%
// Memory : 39.3MB - Beats: 48.90%
// Link submission:
// https://leetcode.com/problems/n-th-tribonacci-number/submissions/1034499952/