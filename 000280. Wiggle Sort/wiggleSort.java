class Solution {
    public void wiggleSort(int[] nums) {
        // Arrays.sort(nums);
        // int i = 1;
        // int j = i+1;
        // while(j < nums.length){
        // swap(nums,i,j);
        // i += 2;
        // j = i+1;
        // }

        for (int i = 0; i < nums.length - 1; i++) {
            // even index: nums[i] <= nums[i+1]
            if (i % 2 == 0) {
                if (nums[i] <= nums[i + 1]) {
                    continue;
                } else {
                    swap(nums, i, i + 1);
                }
            // odd index: nums[i] >= nums[i+1]
            } else {
                if (nums[i] >= nums[i + 1]) {
                    continue;
                } else {
                    swap(nums, i, i + 1);
                }
            }
        }

        

    }

    public void swap(int[] myArr, int index1, int index2) {
        int temp = myArr[index1];
        myArr[index1] = myArr[index2];
        myArr[index2] = temp;
    }
}