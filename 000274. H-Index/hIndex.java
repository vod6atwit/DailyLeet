class Solution {
  public int hIndex(int[] citations) {
    int n = citations.length;
    int[] citations_count = new int[n + 1];

    // loop through citations and count how many citation for each paper and assign
    // it to the citations_count array
    for (int i = 0; i < n; i++) {
      // if the number of citation > num of paper, increase the last index (the max
      // number of paper)
      if (citations[i] > n) {
        citations_count[n]++;
      } else
        citations_count[citations[i]]++;
    }

    int count = 0;
    // count from right to left, if count >= the current index, return that index,
    // otherwise return 0.
    for (int i = n; i >= 0; i--) {
      count += citations_count[i];
      if (count >= i) {
        return i;
      }
    }
    return 0;
  }
}

// citations = [3,0,6,1,5]

// citations_count = [1,0,0,1,0,2]. index 5 has 2 counts because there are two
// number that greater than the maximum number of paper

// Runtime : 0 ms - Beats: 100%
// Memory : 40.40 MB - Beats: 91.07%
// Link submission:
// https://leetcode.com/problems/h-index/submissions/1071134462/