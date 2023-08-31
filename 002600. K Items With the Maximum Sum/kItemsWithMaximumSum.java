class Solution {
  public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
    if (numOnes >= k) {
      return k;
    } else if (numOnes + numZeros >= k) {
      return numOnes;
    } else
      return numOnes - (k - (numOnes + numZeros));
  }
}

// 6, 6, 6, k = 13
// 6 - (13 -(6+6))

// Runtime : 1 ms - Beats: 100%
// Memory : 39.6 MB - Beats: 88.95%
// Link submission:
// https://leetcode.com/problems/k-items-with-the-maximum-sum/submissions/1036858842/