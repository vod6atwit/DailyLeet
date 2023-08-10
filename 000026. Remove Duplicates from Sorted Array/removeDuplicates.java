class Solution {
  public int removeDuplicates(int[] nums) {
    int left = 1;
    int right = 1;
    while (right < nums.length) {
      if (nums[right] != nums[right - 1]) {
        nums[left] = nums[right];
        left++;
      }
      right++;
    }
    return left;
  }
}

// two pointer problem
// Runtime : 1 ms - Beats: 98.52%
// Memory : 43.49 MB - Beats: 98.32%
// Link submission:
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/