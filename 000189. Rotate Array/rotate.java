class Solution {
  public void rotate(int[] nums, int k) {
    k = k % nums.length;
    int left = 0;
    int right = nums.length - 1;
    while (left < right) {
      int temp = nums[left];
      nums[left] = nums[right];
      nums[right] = temp;
      left++;
      right--;
    }

    left = 0;
    right = k - 1;
    while (left < right) {
      int temp = nums[left];
      nums[left] = nums[right];
      nums[right] = temp;
      left++;
      right--;
    }

    left = k;
    right = nums.length - 1;
    while (left < right) {
      int temp = nums[left];
      nums[left] = nums[right];
      nums[right] = temp;
      left++;
      right--;
    }
  }
}

// k = 3
// [1,2,3,4,5,6,7]
// [7,6,5,4,3,2,1]
// [7,6,5][4,3,2,1]
// [5,6,7][1,2,3,4]

// Runtime : 2 ms - Beats: 23.83%
// Memory : 55.8 MB - Beats: 48.94%
// Link submission:
// https://leetcode.com/problems/rotate-array/submissions/1058243868
