class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x_diff = coordinates[1][0] - coordinates[0][0];
        int y_diff = coordinates[1][1] - coordinates[0][1];
        for(int i = 2; i < coordinates.length; i++){
            int new_x_diff = coordinates[i][0] - coordinates[0][0];
            int new_y_diff = coordinates[i][1] - coordinates[0][1];
            if(x_diff * new_y_diff != y_diff * new_x_diff){
                return false;
            }
        }

        return true;
    }
}

// 2-1/2-1 = 1/1
// 2-1/0-1 = 1/-1