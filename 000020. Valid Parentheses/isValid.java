class Solution {
  public boolean isValid(String s) {
    if (s.length() % 2 != 0)
      return false;

    char[] s_array = s.toCharArray();
    ArrayList<Character> stack = new ArrayList<>();

    for (int i = 0; i < s_array.length; i++) {
      if (s_array[i] == '(' || s_array[i] == '{' || s_array[i] == '[') {
        stack.add(s_array[i]);
      } else if (s_array[i] == ')' && stack.size() != 0 && stack.get(stack.size() - 1) == '(') {
        stack.remove(stack.size() - 1);
      } else if (s_array[i] == '}' && stack.size() != 0 && stack.get(stack.size() - 1) == '{') {
        System.out.println("here");
        stack.remove(stack.size() - 1);
      } else if (s_array[i] == ']' && stack.size() != 0 && stack.get(stack.size() - 1) == '[') {
        stack.remove(stack.size() - 1);
      } else if (s_array[i] == ')' || s_array[i] == '}' || s_array[i] == ']') {
        return false;
      } else
        break;
    }

    if (stack.size() == 0) {
      return true;
    } else {
      return false;
    }
  }
}
// ([{}])

// ([{

// stack problem

// Runtime : 2ms - Beats: 90.35%
// Memory : 40.74 MB - Beats: 29.46%
// Link submission:
// https://leetcode.com/problems/valid-parentheses/submissions/1017131039/