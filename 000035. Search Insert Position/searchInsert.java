class Solution {
  public int searchInsert(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;
    while (low <= high) {
      int middle = low + (high - low) / 2;
      if (nums[middle] == target) {
        return middle;
      } else if (nums[middle] < target) {
        low = middle + 1;
      } else if (nums[middle] > target) {
        high = middle - 1;
      }
    }
    return low;
  }
}

// [1,3,5,6] 2
// l m h

// Runtime : 0 ms - Beats: 100%
// Memory : 42.8 MB - Beats: 97.24%
// Link submission:
// https://leetcode.com/problems/search-insert-position/submissions/1017863760/