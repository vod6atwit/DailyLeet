class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int up = 0;
        int down = row - 1;
        int left = 0;
        int right = col - 1;

        while(result.size() != row * col){
            // travel from left to right upper
            for(int i = left; i <= right; i++){
                result.add(matrix[up][i]);
            }

            // travel from up right to down right
            for(int i = up + 1; i <= down; i++){
                result.add(matrix[i][right]);
            }


            // travel from down right to down left
            // make sure not the same row
            if(up != down){
                for(int i = right - 1; i >= left; i--){
                    result.add(matrix[down][i]);
                }
            }

            // travel from left down to left upper
            // make sure not the same column
            if(left != right){
                for(int i = down - 1; i > up; i--){
                    result.add(matrix[i][left]);
                }
            }

            up++;
            right--;
            down--;
            left++;

        }
        return result;
    }
}