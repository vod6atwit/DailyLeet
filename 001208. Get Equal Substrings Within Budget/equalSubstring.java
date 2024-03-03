class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int max_length = 0;
        int start = 0;
        int end = 0;
        int cost = 0;

        for(int i = end; i < s.length(); i++){
            int diff = Math.abs(s.charAt(i) - t.charAt(i));
            cost += diff;
            while(cost > maxCost){
                cost -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }
            max_length = Math.max(max_length, i-start+1);
        }

        return max_length;
    }
}

// abcd
// bcdf
//  s
//    e

// e[a]-e[b] = 1 => max = 1 <= maxcost = 3
// e[b]-e[c] = 1 => max = 2 <= maxcost = 3
// e[c]-e[d] = 1 => max = 3 <= maxcost = 3
// e[d]-e[f] = 1 => max = 4 > maxcost = 3

// while(max > maxcost) , increasing s and take the max - (s[a]-s[b])
// max - (s[a]-s[b]) = 4 - 1 = 3 <= maxcost = 3

// compare the max and the length between e vs s: Math.max(max, e-s+1)