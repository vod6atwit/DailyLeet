class Solution {
  public int jump(int[] nums) {
    int curEnd = 0;
    int curFarthest = 0;
    int jump = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      curFarthest = Math.max(curFarthest, i + nums[i]);
      if (curEnd == i) {
        curEnd = curFarthest;
        jump++;
      }
    }

    return jump;
  }
}

// Runtime : 2ms - Beats: 65.4%
// Memory : 44.3MB - Beats: 73.91%
// Link submission:
// https://leetcode.com/problems/jump-game-ii/submissions/1067042453/