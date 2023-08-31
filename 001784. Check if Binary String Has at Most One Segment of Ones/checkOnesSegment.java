class Solution {
  public boolean checkOnesSegment(String s) {
    if (s.length() == 1) {
      return true;
    }

    int left = 0;
    int right = 0;

    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == '1') {
        left = i;
      }
      if (s.charAt(i) == '0') {
        right = i;
      }
      if (left > right && right != 0) {
        return false;
      }
    }

    return true;
  }
}

// 1001
// l
// r

// 11
// r
// l

// 1000
// l
// r

// "10110000"
// l
// r

// Runtime : 0 ms - Beats: 100%
// Memory : 40 MB - Beats: 99.25%
// Link submission:
// https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/submissions/1036889678/