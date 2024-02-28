class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int mat_length = mat.length;
        
        int i = 0;
        int j = mat_length - 1;

        while(i < mat_length){
            if(mat_length % 2 != 0 && i == j){
                sum += mat[i][j];
            }else{
                sum += mat[i][i] + mat[i][j];
            }
            i++;
            j--;
        }

        // if(mat_length % 2 != 0){
        //     while(i < mat_length){
        //         if(i == j){
        //             sum += mat[i][j];
        //         }else{
        //             sum += mat[i][i] + mat[i][j];
        //         }
        //         i++;
        //         j--;
        //     }
        // }else{
        //     while(i < mat_length){
        //         sum += mat[i][i] + mat[i][j];
        //         i++;
        //         j--;
        //     }
        // }
        
        return sum;

    }
}
