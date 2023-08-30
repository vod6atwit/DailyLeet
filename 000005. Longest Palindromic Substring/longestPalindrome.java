class Solution {
  public String longestPalindrome(String s) {
    if (s == null || s.length() < 1) {
      return "";
    }

    // init start , end of substring
    int start = 0;
    int end = 0;
    // loop through each char in s and do the expand to find the logest
    for (int i = 0; i < s.length(); i++) {
      int len1 = expand(s, i, i); // case 1
      // System.out.println("len1: " + len1);
      int len2 = expand(s, i, i + 1); // case 2
      // System.out.println("len2: " + len2);
      // compare and get the max
      int len = Math.max(len1, len2);

      // found the new longest substring
      if (len > end - start) {
        start = i - ((len - 1) / 2); // need to substract 1 because we start at index 0
        end = i + (len / 2);
      }
    }

    return s.substring(start, end + 1); // end + 1 because go up to end
  }

  public int expand(String s, int left, int right) {
    // if(s == null || left > right) return 0;

    while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
      left--;
      right++;
      // System.out.println(left);
      // System.out.println(right);

    }

    return right - left - 1;
    // 12
    // abbc
    // return 2 - 1 + 1 = 2(character)
  }
}

// There two case that we have to check
// 1: normal palindromic string
// ex: "aabbaa"
// For this case, we will have 2 pointer compare at the same time, then continue
// move left-- and right++ until out of bound

// 2: special palindromic string
// ex: "racecar"
// For this case, We will have only 1 pointer to the middle and move left-- ,
// right++ to compare until of out bound

// We have to check both case at the same time
// And get the max of both case (logest)

// and we check if the length is greater than the (end - start), we will
// reassign the value of end and start

// Runtime : 16ms - Beats: 81.87%
// Memory : 41MB - Beats: 88.3%
// Link submission:
// https://leetcode.com/problems/longest-palindromic-substring/submissions/1036166066/