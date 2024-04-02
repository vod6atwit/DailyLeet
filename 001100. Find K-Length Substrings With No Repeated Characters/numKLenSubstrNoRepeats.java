class Solution {
    public int numKLenSubstrNoRepeats(String s, int k) {
        if (k > s.length()) {
            return 0;
        }
        int left = 0;
        int right = 0;
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (right < s.length()) {
            if (map.containsKey(s.charAt(right))) {
                int lastseen_idx = map.get(s.charAt(right));
                while (left != lastseen_idx + 1) {
                    map.remove(s.charAt(left));
                    left += 1;
                }
            }

            map.put(s.charAt(right), right);

            if (right - left + 1 == k) {
                result += 1;
                map.remove(s.charAt(left));
                left += 1;
            }
            right++;
        }
        return result;
    }
}

// havefunonleetcode
// i
// j

// {t:12, c:13, o:14, d:15, e:16}