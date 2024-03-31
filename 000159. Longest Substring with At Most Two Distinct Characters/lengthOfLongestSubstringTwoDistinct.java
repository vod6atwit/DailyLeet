class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int result = 0;
        int left = 0;
        int right = 0;
        Map<Character, Integer> map = new HashMap<>(2);
        while(right < s.length()){
            map.put(s.charAt(right), right);

            if(map.size() == 3){
                // find the min
                int index = Collections.min(map.values());
                map.remove(s.charAt(index));
                left = index + 1;
            }
            result = Math.max(result, right - left + 1);
            right++;
        }
        return result;
    }
}

// ccaabbb
//   i
//     j