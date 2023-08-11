class Solution {
  public int[] plusOne(int[] digits) {
    int n = digits.length;

    for (int i = n - 1; i >= 0; i--) {
      if (digits[i] < 9) {
        digits[i]++;
        return digits;
      } else {
        digits[i] = 0;
      }
    }

    int[] new_digits = new int[n + 1];
    new_digits[0] = 1;

    return new_digits;
  }
}

// Runtime : 0 ms - Beats: 100%
// Memory : 41.5 MB - Beats: 7.25%
// Link submission:
// https://leetcode.com/problems/plus-one/submissions/1018764467/