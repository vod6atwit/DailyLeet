class Solution {
  public String addBinary(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int a_length = a.length() - 1;
    int b_length = b.length() - 1;
    int carry = 0;
    while (a_length >= 0 || b_length >= 0) {
      int sum = carry;
      sum = sum + (a_length >= 0 ? a.charAt(a_length) : '0') - '0'; // 0 + '1' - '0' = 49 - 48 = 1
      sum = sum + (b_length >= 0 ? b.charAt(b_length) : '0') - '0'; // 1 + '1' - '0' = 1 + 49 - 48 = 2

      carry = sum / 2;
      int value = sum % 2;

      sb.append(value);

      a_length--;
      b_length--;
    }

    if (carry == 1) {
      sb.append(1);
    }

    return sb.reverse().toString();
  }
}

// 11
// 1
// 100

// Runtime : 1 ms - Beats: 100%
// Memory : 41 MB - Beats: 86.23%
// Link submission:
// https://leetcode.com/problems/add-binary/submissions/1019673306/
