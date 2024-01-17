class Solution {
  public String reverseWords(String s) {
    String[] str = s.trim().split("\\s+");
    for (String string : str) {
      System.out.println(string);
    }
    int i = 0;
    int j = str.length - 1;
    while (i < j) {
      String temp = str[i];
      str[i] = str[j];
      str[j] = temp;
      i++;
      j--;
    }

    StringBuffer sb = new StringBuffer();
    for (int k = 0; k < str.length; k++) {
      sb.append(str[k]);
      if (k != str.length - 1) {
        sb.append(" ");
      }
    }

    String result = sb.toString();
    return result;
  }
}

// Runtime : 22ms - Beats: 6.52%
// Memory : 43.36MB - Beats: 56.88%
// Link submission:
// https://leetcode.com/problems/reverse-words-in-a-string/submissions/1074418260/