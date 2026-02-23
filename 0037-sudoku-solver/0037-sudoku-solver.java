class Solution {
    public void solveSudoku(char[][] board) {
        solver(board, 0, 0);
    }

    public boolean solver(char[][] board, int row, int col) {

        if (row == 9)
            return true;

        if (col == 9)
            return solver(board, row + 1, 0);

        if(board[row][col] != '.') 
            return solver(board, row, col+1); 

        for (char digit = '1'; digit <= '9'; digit++) {
            if (isValid(board, row, col, digit)) {
                board[row][col] = digit;

                if (solver(board, row, col + 1))
                    return true;

                board[row][col] = '.';
            }
        }

        return false;
    }

    public boolean isValid(char[][] board, int row, int col, char digit) {

        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == digit)
                return false; // vertical 
            if (board[i][col] == digit)
                return false; // horizontal 
        }

        // check grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == digit)
                    return false;
            }
        }

        return true;

    }

}