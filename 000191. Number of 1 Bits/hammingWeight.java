public class Solution {
  // you need to treat n as an unsigned value
  public int hammingWeight(int n) {
    int result = 0;
    for (int i = 0; i < 32; i++) {
      int bit = n & (1 << i);
      if (bit != 0) {
        result++;
      }
    }

    return result;
  }
}

// Runtime : 0 ms - Beats: 100%
// Memory : 39 MB - Beats: 93.54%
// Link submission:
// https://leetcode.com/problems/number-of-1-bits/submissions/1046865999