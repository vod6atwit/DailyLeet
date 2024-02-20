class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int index = -1;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < points.length; i++){
            int x_point = points[i][0]; // 0,0.    1,0.   2,0
            int y_point = points[i][1]; // 0,1.  1,1.   2,1
            if(x_point == x || y_point == y){
     
                int dis = Math.abs(x-x_point) + Math.abs(y-y_point);
                if(dis < min){
                    min = dis;
                    index = i;
                }
            }

        }

        return index;
    }
}

// Runtime : 2ms - Beats: 100%
// Memory : 49.22MB - Beats: 73.99%
// Link submission: https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/submissions/1181169705/