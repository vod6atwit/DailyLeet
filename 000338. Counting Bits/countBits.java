class Solution {
  public int[] countBits(int n) {
    int[] result = new int[n + 1];
    int offset = 1;
    result[0] = 0;
    for (int i = 1; i < result.length; i++) {
      if (offset * 2 == i) {
        offset = i;
      }
      result[i] = 1 + result[i - offset];
    }
    return result;

  }
}

// 0 -> 00 offset = 1
// 1 -> 01 offset = 1 , 1 * 2 != 1
// 2 -> 10 offset = 1 , 1 * 2 == 2, offset = 2
// 3 -> 11 offset = 2 , 2 * 2 != 3
// 4 -> 100 offset = 2 , 2 * 2 == 4, offset = 4
// 5 -> 101
// 6 -> 110
// 7 -> 111
// 8 -> 1000

// 1st offset = 0 * 2 = 0
// 2nd offset = 1 * 2 = 2
// 3rd offset = 2 * 2 = 4
// 4th offset = 3 * 2 = 8
// 5th offset = 4 * 2 = 16

// Runtime : 2 ms - Beats: 71.83%
// Memory : 46 MB - Beats: 97.64%
// Link submission:
// https://leetcode.com/problems/counting-bits/submissions/1034316865/
