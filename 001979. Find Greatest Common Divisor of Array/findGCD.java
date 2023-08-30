class Solution {
  public int findGCD(int[] nums) {
    int min = nums[0];
    int max = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
      if (nums[i] < min) {
        min = nums[i];
      }
    }

    return gcd(min, max);
  }

  public int gcd(int a, int b) {
    if (b == 0)
      return a;
    return gcd(b, a % b);
  }
}

// Runtime : 0 ms - Beats: 100%
// Memory : 42.8 MB - Beats: 75.79%
// Link submission:
// https://leetcode.com/problems/find-greatest-common-divisor-of-array/submissions/1036345135/