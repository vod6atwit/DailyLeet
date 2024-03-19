class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length())
            return false;

        int i = 0;
        int first_index = -1;
        int second_index = -1;
        int count = 0;

        while (i < s.length() && count < 3) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (first_index == -1) {
                    first_index = i;
                } else if (second_index == -1) {
                    second_index = i;
                }
                count++;
            }
            i++;
        }

        if (s.equals(goal)) {
            int[] freq = new int[26];
            for (char ch : s.toCharArray()) {
                freq[ch - 'a'] += 1;
                if (freq[ch - 'a'] == 2) {
                    return true;
                }
            }

            return false;
        }

        if (second_index != -1 &&
                count == 2 &&
                s.charAt(first_index) == goal.charAt(second_index) &&
                s.charAt(second_index) == goal.charAt(first_index)) {
            return true;
        }
        return false;
    }
}