class Solution {
    public int myAtoi(String s) {
        boolean negative = false;
        int result = 0;
        int index = 0;

        // ignore all space
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }

        // ignore all the Sign
        if (index < s.length() && s.charAt(index) == '-') {
            negative = true;
            index++;
        } else if (index < s.length() && s.charAt(index) == '+') {
            negative = false;
            index++;
        }

        while (index < s.length() && s.charAt(index) >= '0' && s.charAt(index) <= '9') {
            int digit = s.charAt(index) - '0';
            // Check overflow and underflow conditions.
            if ((result > Integer.MAX_VALUE / 10) ||
                    (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                // If integer overflowed return 2^31-1, otherwise if underflowed return -2^31.
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result = result * 10 + digit;
            index++;
        }

        if (negative) {
            result *= -1;
        }

        return result;
    }
}