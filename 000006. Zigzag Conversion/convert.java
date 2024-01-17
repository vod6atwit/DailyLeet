class Solution {
  public String convert(String s, int numRows) {
    if (numRows < 2) {
      return s;
    }

    String[] str = new String[numRows];
    Arrays.fill(str, "");

    int zigzag = 0;
    int i = 0;
    while (i < s.length()) {
      while (i < s.length() && zigzag < numRows) {
        str[zigzag] += s.charAt(i);
        zigzag++;
        i++;
      }
      zigzag -= 2;
      while (i < s.length() && zigzag > 0) {
        str[zigzag] += s.charAt(i);
        zigzag--;
        i++;
      }

    }

    // for(String string : str){
    // System.out.println(string);
    // }

    StringBuffer sb = new StringBuffer();
    for (int k = 0; k < str.length; k++) {
      sb.append(str[k]);
    }

    String result = sb.toString();

    return result;
  }
}

// 3-3
// 3-2
// 3-1
// 3-0
// 3-1
// 3-2
// 3-3
// 3-2
// 3-1
// 3-0

// Runtime : 13ms - Beats: 32.15%
// Memory : 44.42MB - Beats: 68.40%
// Link submission:
// https://leetcode.com/problems/zigzag-conversion/submissions/1074552345/