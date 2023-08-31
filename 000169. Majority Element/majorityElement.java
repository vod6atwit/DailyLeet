class Solution {
  public int majorityElement(int[] nums) {
    // HashMap<Integer, Integer> map = new HashMap<>();

    // for(int i = 0; i < nums.length; i++){
    // if(!map.containsKey(nums[i])){
    // map.put(nums[i], 1);
    // }
    // else {
    // map.put(nums[i], map.get(nums[i]) + 1);
    // }
    // }

    // int result = 0;

    // for(Map.Entry<Integer, Integer> entry: map.entrySet()){
    // if((int)entry.getValue() > nums.length/2){
    // result = (int)entry.getKey();
    // break;
    // }
    // }

    // return result;

    // ------------------------------

    Arrays.sort(nums);
    // appears more than ⌊n / 2⌋ times, so the middle element is the result
    int result = nums[nums.length / 2];

    return result;
  }
}

// [2,2,1,1,1,2,2]
// [1,1,1,2,2,2,2]

// Runtime : 3 ms - Beats: 57.90%
// Memory : 48.5 MB - Beats: 42.44%
// Link submission:
// https://leetcode.com/problems/majority-element/submissions/1037028034/