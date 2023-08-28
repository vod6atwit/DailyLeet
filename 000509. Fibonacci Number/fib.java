class Solution {
  public int fib(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    return fib(n - 1) + fib(n - 2);
  }
}

// Runtime : 10 ms - Beats: 15.92%
// Memory : 39.1 MB - Beats: 59.98%
// Link submission:
// https://leetcode.com/problems/fibonacci-number/submissions/1034356539/