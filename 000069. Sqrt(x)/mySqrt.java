class Solution {
  public int mySqrt(int x) {
    long l = 0;
    long r = x;
    long result = 0;

    while (l <= r) {
      long middle = l + ((r - l) / 2);

      if (middle * middle > x) {
        r = middle - 1;
      } else if (middle * middle < x) {
        result = middle;
        l = middle + 1;
      } else
        return (int) middle;

    }
    return (int) result;
  }
}

// 0 1 2 3 4 5 6 7 8
// r
// l

// Runtime : 1 ms - Beats: 99.22%
// Memory : 40 MB - Beats: 19.91%
// Link submission:
// https://leetcode.com/problems/sqrtx/submissions/1023543504/