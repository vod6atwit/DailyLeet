class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Map<Integer, Integer> myMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            myMap.put(nums[i], i);
        }

        int maxLength = 0;
        for(int i = 0; i < nums.length; i++){
            int leftValue = nums[i] - 1;
            int rightValue = nums[i] + 1;
            if(!myMap.containsKey(leftValue)){
                int length = 1;
                while(myMap.containsKey(rightValue)){
                    length += 1;
                    rightValue += 1;
                }
                maxLength = Math.max(maxLength, length);
            }   
        }

        return maxLength;
    }
}

// Runtime : 1115ms - Beats: 16.47%
// Memory : 65.89MB - Beats: 45.85%
// Link submission: https://leetcode.com/problems/longest-consecutive-sequence/submissions/1174377714/