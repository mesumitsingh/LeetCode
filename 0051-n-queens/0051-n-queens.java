class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>(); 
        char[][] board = new char[n][n]; 
        
        for(int i=0; i<n; i++) { 
            Arrays.fill(board[i], '.'); 
        }

        solve(0, board, ans, n);
        
        return ans;
    }

    public void solve(int row, char[][] board, List<List<String>> ans, int n) { 
        if(row == n) { 
            List<String> temp = new ArrayList<>(); 

            for(int i=0; i<n; i++) { 
                temp.add(new String(board[i])); 
            }

            ans.add(temp); 
            return; 
        }


        for(int j=0; j<n; j++) { 
            if(isSafe(row, j, board, n)) { 
                board[row][j] = 'Q';
                solve(row+1, board, ans, n); 
                board[row][j] = '.';
            }
        }
    }

    public boolean isSafe(int row, int col, char[][] board, int n) {
        // horizontal
        for(int j=0; j<n; j++) { 
            if(board[row][j] == 'Q') return false; 
        }

        // vertical
        for(int j=0; j<n; j++) { 
            if(board[j][col] == 'Q') return false; 
        }

        // left diagonal
        for(int i=row, j=col; i>=0 && j>=0; i--, j--) { 
            if(board[i][j] == 'Q') return false; 
        }

        // right diagonal
        for(int i=row, j=col; i>=0 && j<n; i--, j++) { 
            if(board[i][j] == 'Q') return false;
        }

        return true; 
    }

}