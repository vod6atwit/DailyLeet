class Solution {
    public int findShortestSubArray(int[] nums) {
        int degree = 0;
        int minLength = 0;
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> first_seen = new HashMap<>();
        

        for(int i = 0; i < nums.length; i++){
            // save the first seen
            first_seen.putIfAbsent(nums[i], i);
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            if(count.get(nums[i]) > degree){
                degree = count.get(nums[i]);
                minLength = i - first_seen.get(nums[i]);
            }else if(count.get(nums[i]) == degree){
                minLength = Math.min(minLength, i - first_seen.get(nums[i]));
            }
        }
        return minLength + 1;
    }

}