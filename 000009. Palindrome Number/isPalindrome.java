// Convert integer to string solution

class Solution {
  public boolean isPalindrome(int x) {
    String str = Integer.toString(x);

    int i = 0;
    int j = str.length() - 1;

    while (i < j) {
      if (str.charAt(i) != str.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }

    return true;
  }
}
// Runtime : 7ms - Beats: 83.10%
// Memory : 41.9 MB - Beats: 99.99%

// ----------------------------------------------------------------

// Not convert integer to string solution

class Solution {
  public boolean isPalindrome(int x) {
    ArrayList<Integer> list = new ArrayList<>();
    int num = x;
    int count = 0;
    boolean isNegative;

    if (num < 0) {
      isNegative = true;
      num = -num;
    } else
      isNegative = false;

    while (num != 0) {
      count++;
      int value = num % 10;
      num = num / 10;
      if (num == 0 && isNegative) {
        list.add(-value);
      } else
        list.add(value);
    }
    // System.out.println(count);
    if (count == 1 && isNegative) {
      return false;
    }

    int result = 0;
    for (int i = 0; i < list.size(); i++) {
      // System.out.println(list.get(i));
      result = result * 10 + list.get(i);
    }

    // System.out.println(result);
    // System.out.println(x);

    if (x == result) {
      return true;
    } else
      return false;

  }
}
// Runtime : 6ms - Beats: 87.59%
// Memory : 43.5 MB - Beats: 10.92%
// Link submission:
// https://leetcode.com/problems/palindrome-number/submissions/1016722856/