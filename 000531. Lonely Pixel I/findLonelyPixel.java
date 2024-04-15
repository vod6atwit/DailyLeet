class Solution {
    public int findLonelyPixel(char[][] picture) {
        int[] row_arr = new int[picture.length];
        int[] col_arr = new int[picture[0].length];
        int result = 0;

        for(int row = 0; row < picture.length; row++){
            for(int col = 0; col < picture[row].length; col++){
                if(picture[row][col] == 'B'){
                    row_arr[row] += 1;
                    col_arr[col] += 1;
                }
            }
        }

        for(int row = 0; row < picture.length; row++){
            for(int col = 0; col < picture[row].length; col++){
                if(picture[row][col] == 'B' && row_arr[row] == 1 && col_arr[col] == 1){
                    result++;
                }
            }
        }

        return result;
    }
}


// row
// [0,0,0]
// [0,0,0]
// [0,0,0]
// [0,0,0]

// col
// [0,0,0]