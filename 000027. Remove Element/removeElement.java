class Solution {
  public int removeElement(int[] nums, int val) {
    int left = 0;
    int right = 0;
    while (right < nums.length) {
      if (nums[right] != val) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
      }
      right++;
    }
    return left;
  }
}

// [2,2,3,3]
// i
// j

// two pointer problem
// Runtime : 0 ms - Beats: 100%
// Memory : 40.94 MB - Beats: 75.92%
// Link submission:
// https://leetcode.com/problems/remove-element/submissions/1017661652/