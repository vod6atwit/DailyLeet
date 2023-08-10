// brute force approach 

class Solution {
  public String longestCommonPrefix(String[] strs) {
    String result = "";
    for (int i = 0; i < strs[0].length(); i++) {
      for (int j = 1; j < strs.length; j++) {
        if (i == strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) {
          return result;
        }
      }
      result += strs[0].charAt(i);
    }
    return result;
  }
}

// ----------------------------------------------------------------
// faster solution

class Solution {
  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0)
      return "";
    String result = strs[0];
    for (int i = 1; i < strs.length; i++) {
      // if we can not find the occurrence of result in strs[i]
      // we slice result by 1 until it occurs in strs[i]
      while (strs[i].indexOf(result) != 0) {
        result = result.substring(0, result.length() - 1);
      }
    }
    return result;
  }
}

// Runtime : 0ms - Beats: 100%
// Memory : 40.40 MB - Beats: 65.16%
// Link submission:
// https://leetcode.com/problems/longest-common-prefix/submissions/