class Solution {
  public int lengthOfLongestSubstring(String s) {
    HashMap<Character, Integer> memo = new HashMap<>();
    int result = 0;
    int i = 0;
    int j = 0;

    while (j < s.length()) {
      char c = s.charAt(j);

      if (memo.containsKey(c)) {
        // System.out.println("here");
        int index = memo.get(c);
        // System.out.println("index " + index);

        if (index >= i) {
          i = index + 1;
          memo.replace(c, j);
        }

      }

      result = Math.max(result, j - i + 1);
      // System.out.println(result);
      memo.put(c, j);

      j++;
    }

    return result;
  }
}

// [abca]bcbb
// a[bca]bcbb

// map result = 3
// a : 0 a : 3
// b : 1 -> b : 1
// c : 2 c : 2

// Runtime : 5ms - Beats: 90.92%
// Memory : 43.3 MB - Beats: 89.52%
// Link submission:
// https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/