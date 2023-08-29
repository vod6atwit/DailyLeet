class Solution {
  public int getMaximumGenerated(int n) {
    int[] result = new int[n + 1];
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }

    result[0] = 0;
    result[1] = 1;

    for (int i = 2; i < result.length; i++) {
      if (i % 2 == 0) {
        int num = i / 2;
        result[i] = result[num];
      } else {
        int num = (i - 1) / 2;
        result[i] = result[num] + result[num + 1];
      }
    }

    int max = result[0];
    for (int i = 1; i < result.length; i++) {
      if (result[i] > max) {
        max = result[i];
      }
    }

    return max;
  }
}

// Runtime : 0ms - Beats: 100%
// Memory : 38.7MB - Beats: 98.84%
// Link submission:
// https://leetcode.com/problems/get-maximum-in-generated-array/submissions/1035164698/