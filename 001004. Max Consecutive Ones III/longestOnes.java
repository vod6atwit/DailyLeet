class Solution {
    public int longestOnes(int[] nums, int k) {
        int res = 0;
        int left = 0;
        int num_zero = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                num_zero++;
            }
            
            while(num_zero > k){
                if(nums[left] == 0){
                    num_zero--;
                }
                left++;
            }
            res = Math.max(res, right - left + 1);
        }
        
        return res;
    }
}