class Solution {
  public boolean isHappy(int n) {
    Set<Integer> set = new HashSet<>();

    while (!set.contains(n)) {
      set.add(n);
      n = helper(n);
      if (n == 1) {
        return true;
      }
    }
    return false;
  }

  public int helper(int n) {
    // 19/10 = 1
    // 19%10 = 9
    int sum = 0;
    while (n != 0) {
      sum += (n % 10) * (n % 10);
      n = n / 10;
    }
    return sum;
  }
}

// Runtime : 1 ms - Beats: 87.18%
// Memory : 39.8 MB - Beats: 27.3%
// Link submission:
// https://leetcode.com/problems/happy-number/submissions/1038735173