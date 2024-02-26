class Solution
{

    public String tictactoe(int[][] moves)
    {
        int n = 3;

        int[] rows = new int[n];
        int[] cols = new int[n];
        int diagonal = 0;
        int antiDiagonal = 0;

        int player = 1;

        for(int[] move : moves)
        {
            int row = move[0];
            int col = move[1];

            // add player to the row
            rows[row] += player;

            // add player to the col
            cols[col] += player;

            // add player to the diagonal if row == col
            if(row == col)
            {
                diagonal += player;
            }

            // add player to the antiDiagonal if row + col = n - 1
            if(row + col == n - 1)
            {
                antiDiagonal += player;
            }

            // check if player appear n time on a row
            // check if player appear n time on a col
            // check if player appear n time on a diagonal
            // check if player appear n time on a antiDiagonal
            // return the winner if there is only one condition meet
            if(Math.abs(rows[row]) == n
                    || Math.abs(cols[col]) == n
                    || Math.abs(diagonal) == n
                    || Math.abs(antiDiagonal) == n)
            {
                return player == 1 ? "A" : "B";
            }

            // if not find the winner yet, switch player
            player *= -1;

        }

        // if can not find the winner after all the move
        // return draw if all the boxes have been filled
        // or pending if all the boxes have not been filled
        return moves.length == n * n ? "Draw" : "Pending";

    }

    // private int[][] board;
    // private int n = 3;

    // public String tictactoe(int[][] moves) {
    //     board = new int[n][n];
    //     int player = 1;

    //     for(int i = 0; i < moves.length; i++){
    //         int row = moves[i][0];
    //         int col = moves[i][1];

    //         // mark the box using number own by the player
    //         board[row][col] = player;

    //         // return the winner if there is only one condition meet
    //         if(checkRow(row, player)
    //             || checkCol(col, player)
    //             || row == col && checkDiagonal(player)
    //             || row + col == n -1 && checkAntiDiagonal(player)){
    //             return player == 1 ? "A" : "B";
    //         }

    //         // switch player
    //         player *= -1;
    //     }
    //     return moves.length == n * n ? "Draw" : "Pending";
    // }

    // private boolean checkRow(int row, int player){
    //     for(int i = 0; i < n; i++){
    //         // check if all the rows assign to 1 player, return true
    //         // if not, return false
    //         if(board[row][i] != player) return false;
    //     }
    //     return true;
    // }

    // private boolean checkCol(int col, int player){
    //     for(int i = 0; i < n; i++){
    //         // check if all the cols assign to 1 player, return true
    //         // if not, return false
    //         if(board[i][col] != player) return false;
    //     }
    //     return true;
    // }

    // private boolean checkDiagonal(int player){
    //     for(int i = 0; i < n; i++){
    //         if(board[i][i] != player) return false;
    //     }
    //     return true;
    // }

    // private boolean checkAntiDiagonal(int player){
    //     int i = 0;
    //     int j = n - 1;
    //     while(i < n){
    //         if(board[i][j] != player) return false;
    //         i++;
    //         j--;
    //     }
    //     return true;
    // }



}
