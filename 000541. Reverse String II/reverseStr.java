class Solution {
  public String reverseStr(String s, int k) {
    char[] ch = s.toCharArray();

    int start = 0;
    int end = Math.min(ch.length, start + k);

    while (start < ch.length) {
      helper(ch, start, end);
      start += 2 * k;
      end = Math.min(ch.length, start + k);
    }

    return new String(ch);
  }

  public void helper(char[] c, int start, int end) {
    while (start < end) {
      char temp = c[start];
      c[start] = c[end - 1];
      c[end - 1] = temp;
      start++;
      end--;
    }
  }
}

// Runtime : 0ms - Beats: 100%
// Memory : 43.4 MB - Beats: 70.88%
// Link submission:
// https://leetcode.com/problems/reverse-string-ii/submissions/1029822785/