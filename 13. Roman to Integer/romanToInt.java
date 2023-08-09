// Fastest solution

class Solution {
  public int romanToInt(String s) {
    int sum = 0;
    int length = s.length();
    for (int i = 0; i < length; i++) {
      char c = s.charAt(i);
      switch (c) {
        case 'V':
          sum += 5;
          break;
        case 'I':
          if ((i + 1 < length) && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
            sum--;
          } else {
            sum++;
          }
          break;
        case 'L':
          sum += 50;
          break;
        case 'X':
          if ((i + 1 < length) && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
            sum -= 10;
          } else {
            sum += 10;
          }
          break;
        case 'D':
          sum += 500;
          break;
        case 'M':
          sum += 1000;
          break;
        case 'C':
          if ((i + 1) < length && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
            sum -= 100;
          } else {
            sum += 100;
          }
          break;
      }
    }
    return sum;
  }
}

// Runtime : 2ms - Beats: 100%
// Memory : 43.3 MB - Beats: 97.62%
// Link submission:
// https://leetcode.com/problems/roman-to-integer/submissions/1016932066/

// ----------------------------------------------------------------

// brute-force approach

class Solution {
  public int romanToInt(String s) {
    if (s.equals("I")) {
      return 1;
    }
    if (s.equals("V")) {
      return 5;
    }
    if (s.equals("X")) {
      return 10;
    }
    if (s.equals("L")) {
      return 50;
    }
    if (s.equals("C")) {
      return 100;
    }
    if (s.equals("D")) {
      return 500;
    }
    if (s.equals("M")) {
      return 1000;
    }
    if (s.substring(0, 2).equals("IV")) {
      if (s.length() > 2) {
        return 4 + romanToInt(s.substring(2));
      }
      return 4;
    }
    if (s.substring(0, 2).equals("IX")) {
      if (s.length() > 2) {
        return 9 + romanToInt(s.substring(2));
      }
      return 9;
    }
    if (s.substring(0, 2).equals("XL")) {
      if (s.length() > 2) {
        return 40 + romanToInt(s.substring(2));
      }
      return 40;
    }
    if (s.substring(0, 2).equals("XC")) {
      if (s.length() > 2) {
        return 90 + romanToInt(s.substring(2));
      }
      return 90;
    }
    if (s.substring(0, 2).equals("CD")) {
      if (s.length() > 2) {
        return 400 + romanToInt(s.substring(2));
      }
      return 400;
    }
    if (s.substring(0, 2).equals("CM")) {
      if (s.length() > 2) {
        return 900 + romanToInt(s.substring(2));
      }
      return 900;
    }
    return romanToInt(s.substring(0, 1)) + romanToInt(s.substring(1));
  }
}

// ----------------------------------------------------------------

// Better but not fastest

class Solution {
  public int romanToInt(String s) {
    HashMap<String, Integer> map = new HashMap<>();

    map.put("I", 1);
    map.put("V", 5);
    map.put("X", 10);
    map.put("L", 50);
    map.put("C", 100);
    map.put("D", 500);
    map.put("M", 1000);
    map.put("IV", 4);
    map.put("IX", 9);
    map.put("XL", 40);
    map.put("XC", 90);
    map.put("CD", 400);
    map.put("CM", 900);

    int result = 0;

    int k = 0;
    int i = 1;
    int j = 2;

    while (i <= s.length()) {
      if (j <= s.length() && map.containsKey(s.substring(k, j))) {
        result = result + map.get(s.substring(k, j));
        k = j;
        i = k + 1;
        j = k + 2;
      } else {
        if (map.containsKey(s.substring(k, i))) {
          result = result + map.get(s.substring(k, i));
          k = i;
          i = k + 1;
          j = k + 2;
        }
      }
    }
    return result;
  }
}
