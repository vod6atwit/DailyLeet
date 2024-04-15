class Solution {
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        int[][] result = new int[mat1.length][mat2[0].length];

        for (int i = 0; i < result[0].length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                int value = 0;
                for (int k = 0; k < mat2.length; k++) {
                    value += mat2[k][i] * mat1[j][k];
                }
                result[j][i] = value;
            }
        }
        return result;
    }
}

// [[1,-5]] * [[12],
// [-1]]