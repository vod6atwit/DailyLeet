class Solution {
  public int lengthOfLastWord(String s) {
    int length = s.length() - 1;
    while (s.charAt(length) == ' ') {
      length = length - 1;
    }
    int result = 0;
    while (s.charAt(length) != ' ') {
      result += 1;
      length--;
      if (length < 0)
        break;
    }
    return result;
  }
}

// Runtime : 0 ms - Beats: 100%
// Memory : 40.77 MB - Beats: 63.45%
// Link submission:
// https://leetcode.com/problems/length-of-last-word/submissions/