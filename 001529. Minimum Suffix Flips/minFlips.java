class Solution {
    public int minFlips(String target) {
        int result = 0;
        int current_bit = 0;
        for (char c : target.toCharArray()) {
            // 10111
            // 00000
            // check if the target[i] != init[i] => flip and count++
            // if not, then continue
            int bit = c - '0';
            if (bit != current_bit) {
                current_bit = bit;
                result++;
            }
        }

        return result;
    }
}