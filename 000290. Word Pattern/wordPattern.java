class Solution {
  public boolean wordPattern(String pattern, String s) {
    String[] s_arr = s.split(" ");

    if (pattern.length() != s_arr.length)
      return false;

    HashMap<Character, String> map = new HashMap<>();

    for (int i = 0; i < pattern.length(); i++) {
      if (!map.containsKey(pattern.charAt(i)) && !map.containsValue(s_arr[i])) {
        map.put(pattern.charAt(i), s_arr[i]);
      } else {
        if (map.get(pattern.charAt(i)) != null && map.get(pattern.charAt(i)).equals(s_arr[i])) {
          continue;
        } else {
          return false;
        }
      }
    }

    return true;
  }
}

// Runtime : 1 ms - Beats: 74.11%
// Memory : 40.6 MB - Beats: 24.49%
// Link submission:
// https://leetcode.com/problems/word-pattern/submissions/1037970932