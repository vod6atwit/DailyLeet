class Solution {
  public int climbStairs(int n) {
    // two last step
    int one = 1;
    int two = 1;

    for (int i = n - 2; i >= 0; i--) {
      int temp = one;
      one = one + two;
      two = temp;
    }

    return one;
  }
}

// n = 5

// start at 0
// 0
// 1
// 2 - 1 step to 3 (3 has 2 ways to 5) or 2 step to 4 (4 has 1 way to 5)
// 3 - 1 step to 4 (4 has 1 way to 5) or 2 step to 5
// 4 - 1 step to 5
// 5 - 1 step default

// Runtime : 0 ms - Beats: 100%
// Memory : 39.1 MB - Beats: 78.78%
// Link submission:
// https://leetcode.com/problems/climbing-stairs/submissions/1024239241/