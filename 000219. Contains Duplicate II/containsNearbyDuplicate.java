class Solution {
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      if (!map.containsKey(nums[i])) {
        map.put(nums[i], i);
      } else {
        int num = Math.abs(map.get(nums[i]) - i);
        if (num <= k) {
          return true;
        } else {
          map.put(nums[i], i);
        }
      }
    }

    return false;
  }
}

// Runtime : 18 ms - Beats: 68.11%
// Memory : 56.9 MB - Beats: 35.16%
// Link submission:
// https://leetcode.com/problems/k-items-with-the-maximum-sum/submissions/1036858842/
