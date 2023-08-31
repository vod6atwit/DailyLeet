class Solution {
  public List<String> summaryRanges(int[] nums) {
    List<String> result = new ArrayList<>();

    if (nums.length == 0) {
      return result;
    }

    int a = nums[0];

    for (int i = 0; i < nums.length; i++) {
      if (i == nums.length - 1 || nums[i] + 1 != nums[i + 1]) {
        if (a != nums[i]) {
          result.add(a + "->" + nums[i]);
        } else {
          result.add("" + a + "");
        }

        if (i != nums.length - 1) {
          a = nums[i + 1];
        }
      }
    }
    return result;
  }
}

// a
// [0,1,2,4,5,7]
// i

// a
// [0,1,2,4,5,7]
// i

// a
// [0,1,2,4,5,7]
// i

// Runtime : 5 ms - Beats: 85.86%
// Memory : 40.5 MB - Beats: 93.65%
// Link submission:
// https://leetcode.com/problems/summary-ranges/submissions/1037149652/