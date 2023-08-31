class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {
    HashMap<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < magazine.length(); i++) {
      if (!map.containsKey(magazine.charAt(i))) {
        map.put(magazine.charAt(i), 1);
      } else {
        map.put(magazine.charAt(i), map.get(magazine.charAt(i)) + 1);
      }
    }

    int i = 0;
    while (i < ransomNote.length()) {
      if (map.containsKey(ransomNote.charAt(i)) && map.get(ransomNote.charAt(i)) > 0) {
        map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) - 1);
      } else {
        i = -1;
        break;
      }
      i++;
    }

    if (i == ransomNote.length()) {
      return true;
    }
    return false;
  }
}

// Time complexity: O(n) with n is the length of magazine
// Space complexity: O(n) with n is the length of magazine

// Runtime : 13 ms - Beats: 53.25%
// Memory : 44 MB - Beats: 58.78%
// Link submission:
// https://leetcode.com/problems/ransom-note/submissions/1037067958/