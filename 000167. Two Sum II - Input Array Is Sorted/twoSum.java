class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int result[] = new int[2];
        map.put(numbers[0], 1);

        for(int i = 1; i < numbers.length; i++){
            int num = target - numbers[i];

            if(map.containsKey(num)){
                result[0] = map.get(num);
                result[1] = i+1;
                
            }else {
                map.put(numbers[i],i+1);
            }
        }
        return result;
    }
}

// 2 -> 1
// 9 - 7 = 2

// Runtime : 9ms - Beats: 10.10%
// Memory : 45.58MB - Beats: 88.44%
// Link submission: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/submissions/1103005273/