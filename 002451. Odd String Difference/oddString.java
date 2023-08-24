class Solution {
  public String oddString(String[] words) {
    // create a matrix with a row = size of string array of words, a column = size
    // of the length of each word in array
    int[][] matrix = new int[words.length][words[0].length()];

    // loop through the row
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      // loop through the column
      for (int j = 0; j < word.length() - 1; j++) {
        matrix[i][j] = word.charAt(j + 1) - word.charAt(j);
      }
    }

    // loop through the matrix to compare
    for (int i = 1; i < matrix.length - 1; i++) {
      // get 3 array at a time
      int[] pre = matrix[i - 1];
      int[] curr = matrix[i];
      int[] next = matrix[i + 1];

      if (Arrays.equals(pre, curr) && !Arrays.equals(curr, next)) {
        return words[i + 1];
      }
      if (Arrays.equals(pre, next) && !Arrays.equals(curr, next)) {
        return words[i];
      }
      if (Arrays.equals(curr, next) && !Arrays.equals(pre, next)) {
        return words[i - 1];
      }
    }

    return "";
  }
}

// 012
// words = ["adc","wzy","abc"]
// 0 1 2
// 0 d-a c-d
// 1 z-w y-z
// 2 b-a c-b

// Runtime : 1 ms - Beats: 85.2%
// Memory : 39.9 MB - Beats: 79.74%
// Link submission:
// https://leetcode.com/problems/odd-string-difference/submissions/1030105660/