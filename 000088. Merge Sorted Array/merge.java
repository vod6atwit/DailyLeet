class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int index = m + n - 1;
    while (m > 0 && n > 0) {
      if (nums1[m - 1] < nums2[n - 1]) {
        nums1[index] = nums2[n - 1];
        n -= 1;
      } else if (nums1[m - 1] >= nums2[n - 1]) {
        nums1[index] = nums1[m - 1];
        m -= 1;
      }
      index -= 1;
    }

    // if there is no elem in nums1
    // take all nums2 and add to front of nums1
    while (n > 0) {
      nums1[index] = nums2[n - 1];
      n -= 1;
      index -= 1;
    }
  }
}

// 0 1 2 3 4 5
// [1,2,3,0,0,0]
// index

// [4,5,6]
// n

// [0]
// [1]

// Runtime : 0ms - Beats: 100%
// Memory : 41 MB - Beats: 90.82%
// Link submission:
// https://leetcode.com/problems/merge-sorted-array/submissions/1024330604/