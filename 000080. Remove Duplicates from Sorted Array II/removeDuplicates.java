class Solution {
  public int removeDuplicates(int[] nums) {
    int left = 0;
    int right = 0;
    while (right < nums.length) {
      int count = 1;
      while (right + 1 < nums.length && nums[right] == nums[right + 1]) {
        right += 1;
        count += 1;
      }

      for (int i = 0; i < Math.min(2, count); i++) {
        nums[left] = nums[right];
        left += 1;
      }

      right += 1;
    }
    return left;
  }
}

// [0,0,1,1,2,1,2,3,3]
// l
// r

// Runtime : 1ms - Beats: 24.76%
// Memory : 44.1MB - Beats: 9.35%
// Link submission: https://leetcode.com/problems/two-sum/submissions/