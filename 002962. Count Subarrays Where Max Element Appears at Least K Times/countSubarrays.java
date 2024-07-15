class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }

        int left = 0;
        int count = 0;
        long res = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] == max){
                count++;
            }
            while(count == k){
                if(nums[left] == max){
                    count--;
                }
                left++;
            }
            res += left;
        }

        return res;
    }
}