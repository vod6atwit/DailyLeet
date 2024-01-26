class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int mn = Integer.MAX_VALUE;
        int sum = 0;
        while(j < nums.length){
            sum += nums[j];
            while(sum >= target){
                sum -= nums[i];
                mn = Math.min(j-i+1, mn);
                i++;
            }
            j++;
        }

        if(mn == Integer.MAX_VALUE){
            return 0;
        }
        return mn;
    }
}



// 2 3 1 2 4 3
//         i
//             j

// sum = 8
// 8>=7 -> sum = 8-2 = 6
// mn = min(3-0+1,inf) = 4
// ------------------------
// sum = 6+4 = 10
// 10 >= 7 -> sum = 10-3 = 7
// mn = min(4-1+1, 4) = 4

// 7 >= 7 -> sum = 7 - 1 = 6
// mn = min(4-2+1, 4) = 3
// -------------------------
// sum = 6+3 = 9
// 9>=7 -> sum = 9-2 = 7
// mn = min(5-3+1, 3) = 3

// 7>=7 -> sum = 7-4 = 3
// mn = min(5-4+1, 3) = 2
// -------------------------
// j = 6 >= size -> return mn = 2;


// Runtime : 1ms - Beats: 99.96%
// Memory : 54.15MB - Beats: 85.91%
// Link submission: https://leetcode.com/problems/minimum-size-subarray-sum/submissions/1103756084/