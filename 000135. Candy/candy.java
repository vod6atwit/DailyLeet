class Solution {
    public int candy(int[] ratings) {
        int[] result = new int[ratings.length];
        Arrays.fill(result, 1);

        // left compare
        // result = [1,1,2]
        for(int i = 1; i < ratings.length; i++){
            if(ratings[i] > ratings[i-1]){
                result[i] = result[i-1] + 1;
                // System.out.println(result[i]);
            }
        }

        // right compare
        // result = [2,1,2]
        for(int i = ratings.length - 2; i >= 0; i--){
            if(ratings[i] > ratings[i+1]){
                result[i] = Math.max(result[i],result[i+1] + 1);
            }
        }

        // for(int i = 0; i < result.length; i++){
        //     System.out.println(result[i]);
        // }
        // sum
        
        int sum = 0;
        for(int i = 0; i < result.length; i++){
            sum = sum + result[i];
        }

        return sum;
    }
}



// Runtime : 3ms - Beats: 85.08%
// Memory : 45.50MB - Beats: 28.50%
// Link submission: https://leetcode.com/problems/candy/submissions/1149235357
