class Solution {
  public boolean isAnagram(String s, String t) {
    // HashMap<Character, Integer> map = new HashMap<>();

    // if (s.length() != t.length())
    // return false;

    // for (int i = 0; i < s.length(); i++) {
    // if (!map.containsKey(s.charAt(i))) {
    // map.put(s.charAt(i), 1);
    // } else {
    // map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
    // }
    // }

    // for (int i = 0; i < t.length(); i++) {
    // if (map.containsKey(t.charAt(i)) && map.get(t.charAt(i)) > 0) {
    // map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
    // } else {
    // return false;
    // }
    // }

    // return true;

    // -------------------------

    char[] arr = s.toCharArray();
    char[] arr2 = t.toCharArray();

    Arrays.sort(arr);
    Arrays.sort(arr2);

    if (arr.length != arr2.length) {
      return false;
    }

    String a = new String(arr);
    String b = new String(arr2);

    if (a.equals(b)) {
      return true;
    }

    return false;
  }
}

// Runtime : 3 ms - Beats: 91.55%
// Memory : 43.8 MB - Beats: 31.17%
// Link submission:
// https://leetcode.com/problems/valid-anagram/submissions/1037992836