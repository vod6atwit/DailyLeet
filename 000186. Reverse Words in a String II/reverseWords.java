class Solution {
    public void reverseWords(char[] s) {
        int start = 0;
        int end = 0;
        reverse(s, 0, s.length - 1);
        while (end < s.length) {
            if (s[end] == ' ') {
                reverse(s, start, end - 1);
                start = end + 1;
            }
            end++;
        }
        reverse(s, start, s.length - 1);
    }

    public void reverse(char[] s, int i, int j) {
        while (i < j) {
            char c = s[i];
            s[i] = s[j];
            s[j] = c;
            i++;
            j--;
        }
    }
}