class Solution {
  public boolean canJump(int[] nums) {
    int goal = nums.length - 1;
    if (nums.length == 1)
      return true;
    for (int i = nums.length - 2; i >= 0; i--) {
      if (goal <= nums[i] + i) {
        goal = i;
      }
    }
    if (goal == 0)
      return true;
    return false;
  }
}

// 0 1 2 3 4
// [2,3,1,1,4]
// goal

// 0 1 2
// [2,0,0]
// goal

// Runtime : 1ms - Beats: 99.98%
// Memory : 44MB - Beats: 73.35%
// Link submission:
// https://leetcode.com/problems/jump-game/submissions/1062373950/
