class Solution {
  public void reverseString(char[] s) {
    int i = 0;
    int j = s.length - 1;

    while (i < j) {
      char temp = s[i];
      s[i] = s[j];
      s[j] = temp;
      i++;
      j--;
    }
  }
}

// Runtime : 0ms - Beats: 100%
// Memory : 50.6 MB - Beats: 66.19%
// Link submission:
// https://leetcode.com/problems/reverse-string/submissions/1029688959/