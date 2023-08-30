class Solution {
  public boolean isPalindrome(String s) {
    s = s.replaceAll("[^a-zA-Z0-9]", "");
    s = s.toLowerCase();

    int left = 0;
    int right = s.length() - 1;

    while (left <= right && s.charAt(left) == s.charAt(right)) {
      left++;
      right--;
    }

    if (left > right) {
      return true;
    }
    return false;

    // --------------------------

    // if(s.length() < 1) return true;

    // int left = 0;
    // int right = 0;
    // int mid = s.length()/2;
    // left = mid - 1;

    // if(s.length()%2 == 0){
    // right = mid;
    // }else{
    // right = mid + 1;
    // }

    // while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
    // left--;
    // right++;
    // }

    // if(left < 0){
    // return true;
    // }

    // return false;

    // --------------------------
  }
}

// "raceacar"

// "cabbad"

// "abba"

// "racecar"

// "amanaplanacanalpanama"

// Runtime : 22 ms - Beats: 33.42%
// Memory : 43.3 MB - Beats: 60.72%
// Link submission:
// https://leetcode.com/problems/valid-palindrome/submissions/1036205649/