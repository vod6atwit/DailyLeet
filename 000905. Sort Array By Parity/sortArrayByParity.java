class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int j = 0;
        int i = 0;
        while(j < nums.length){
            if(nums[j] % 2 == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
        return nums;
    }
}

// 2,1,3,4
//   i
//       j