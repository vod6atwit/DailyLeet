class Solution {
    public int divisibleTripletCount(int[] nums, int d) {
        int[] mods = new int[d];
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int remainMod = -1;
                // if we can find the number n modolus d such that n % d = e
                // because e always smaller than d, so if (nums[i] + nums[j]) % d = 0
                // then e can not equal d, so e needs to be a 0
                // so we have e = (d - ((nums[i] + nums[j]) % d)) % d

                // EX:
                // ( 3 + 3 ) % 3 = 0
                // a % 3 = 3 - 0 = 3
                // but because The remainder will always be less than the divisor, that means 
                // a % 3 = n such that n < 3
                // so n needs to be a 0 <=> a % 3 = 0

                // (3 + 4) % 5 = 2
                // a % 5 = 5 - 2 = 3
                if ((nums[i] + nums[j]) % d == 0) {
                    remainMod = 0;
                } else {
                    remainMod = d - ((nums[i] + nums[j]) % d);
                }

                res += mods[remainMod];
            }

            // count the number e such that n % d = e
            mods[nums[i] % d]++;
        }
        return res;
    }
}