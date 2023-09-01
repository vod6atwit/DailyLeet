class Solution {
  public boolean isIsomorphic(String s, String t) {
    HashMap<Character, Character> map = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      if (!map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(i))) {
        map.put(s.charAt(i), t.charAt(i));
      } else {
        if (map.get(s.charAt(i)) != null && map.get(s.charAt(i)) == t.charAt(i)) {
          continue;
        } else {
          return false;
        }
      }
    }
    return true;
  }
}

// Runtime : 14 ms - Beats: 32.87%
// Memory : 41.2 MB - Beats: 91.36%
// Link submission:
// https://leetcode.com/problems/isomorphic-strings/submissions/1037961664/