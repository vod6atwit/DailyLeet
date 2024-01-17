class Solution {
  public String intToRoman(int num) {
    String result = "";
    while (num != 0) {
      if (num >= 1000) {
        result += 'M';
        num -= 1000;
      }
      if (num < 1000 && num >= 900) {
        result += "CM";
        num -= 900;
      }
      if (num < 900 && num >= 500) {
        result += 'D';
        num -= 500;
      }
      if (num < 500 && num >= 400) {
        result += "CD";
        num -= 400;
      }
      if (num < 400 && num >= 100) {
        result += 'C';
        num -= 100;
      }
      if (num < 100 && num >= 90) {
        result += "XC";
        num -= 90;
      }
      if (num < 90 && num >= 50) {
        result += 'L';
        num -= 50;
      }
      if (num < 50 && num >= 40) {
        result += "XL";
        num -= 40;
      }
      if (num < 40 && num >= 10) {
        result += 'X';
        num -= 10;
      }
      if (num < 10 && num >= 9) {
        result += "IX";
        num -= 9;
      }
      if (num < 9 && num >= 5) {
        result += 'V';
        num -= 5;
      }
      if (num < 5 && num >= 4) {
        result += "IV";
        num -= 4;
      }
      if (num < 4 && num >= 1) {
        result += 'I';
        num -= 1;
      }
    }
    // result += 'I';
    return result;
  }
}

// 1000: M
// 900: CM
// 500: D
// 400: CD
// 100: C
// 90: XC
// 50: L
// 40: XL
// 10: X
// 9: IX
// 5: V
// 4: IV
// 1: I

// Runtime : 6ms - Beats: 43.57%
// Memory : 43.6MB - Beats: 76.83%
// Link submission:
// https://leetcode.com/problems/integer-to-roman/submissions/1072836738/
