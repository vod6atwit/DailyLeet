class Solution {
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> memo = new HashMap<>();
    int[] result = new int[2];

    memo.put(nums[0], 0);

    for (int i = 1; i < nums.length; i++) {
      int n = target - nums[i];

      if (memo.containsKey(n)) {
        result[0] = memo.get(n);
        result[1] = i;
        return result;
      }
      memo.put(nums[i], i);
    }
    return null;
  }
}

// Runtime : 1ms - Beats: 99.36%
// Memory : 43.6MB - Beats: 77.71%
// Link submission: https://leetcode.com/problems/two-sum/submissions/
