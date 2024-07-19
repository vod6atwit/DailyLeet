class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int res = 0;
        for(int right = 0; right < nums.length; right++){
            if(!map.containsKey(nums[right])){
                map.put(nums[right], 1);
            }else{
                map.put(nums[right], map.get(nums[right]) + 1);
            }

            while(map.get(nums[right]) > k){
                map.put(nums[left], map.get(nums[left]) - 1);
                left++;
            }
            res = Math.max(res, right - left + 1);
            
        }
        return res;
    }
}