class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int result = 0;
        int left = 0;
        int right = 0;
        Map<Character, Integer> map = new HashMap<>();
        while(right < s.length()){
            map.put(s.charAt(right), right);
            if(map.size() == k+1){
                int min_index = Collections.min(map.values());
                map.remove(s.charAt(min_index));
                left = min_index + 1;
            }
            result = Math.max(result, right - left + 1);
            right++;
        }
        return result;
    }
}