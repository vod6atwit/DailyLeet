class Solution {
  public int singleNumber(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }

    int result = 0;
    for (int i = 0; i < nums.length; i++) {
      result = nums[i] ^ result;
      // System.out.println(result);
    }
    return result;
  }
}

// Bit wise problem
// 4 100
// 1 001
// 2 010
// 1 001
// 2 010

// 001 XOR 001 = 000
// 010 XOR 010 = 000
// 100 XOR 000 XOR 000 = 100 = 4

// Runtime : 1 ms - Beats: 99.99%
// Memory : 44.6 MB - Beats: 41.96%
// Link submission:
// https://leetcode.com/problems/single-number/submissions/1036226656/