public class Solution {
  // you need treat n as an unsigned value
  public int reverseBits(int n) {
    int result = 0;
    for (int i = 0; i < 32; i++) {
      int num = n & (1 << i);

      if (num != 0) {
        result = result | (1 << (31 - i));
      }
    }

    return result;
  }
}

// Runtime : 1 ms - Beats: 50.74%
// Memory : 40.5 MB - Beats: 82.75%
// Link submission:
// https://leetcode.com/problems/reverse-bits/submissions/1046799430