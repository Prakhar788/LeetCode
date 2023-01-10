// class Solution {
//     public void solveSudoku(char[][] board) {
//         helper(board, 0, 0);
        
//     }
//     public boolean helper(char[][]board,int row,int col){
//         if (col == 9) {
// 			row++;
// 			col = 0;
// 		}
// 		if (row == 9) {
			
// 			return true;
// 		}
//         if(board[row][col]!='.'){
//             helper(board,row,col+1);
//         }
//         else{
//             for(int i=1;i<=9;i++){
//                 if(isValid(board,row,col,i)==true){
//                     board[row][col]=(char)(i + '0');
//                     helper(board,row,col+1);
//                     board[row][col]='.';
//                 }
//             }
//         }
//         return true;
//     }
//     public static boolean isValid(char[][] grid, int row, int col, int val) {
		
// 		int c = 0;
// 		while (c < 9) {
// 			if (grid[row][c] == val) {
// 				return false;
// 			}
// 			c++;
// 		}

// 		// col
// 		int r = 0;
// 		while (r < 9) {
// 			if (grid[r][col] == val) {
// 				return false;
// 			}
// 			r++;
// 		}

// 		// 3*3 Matrix
// 		r = row - row % 3;
// 		c = col - col % 3;
// 		for (int i = r; i < r + 3; i++) {
// 			for (int j = c; j < c + 3; j++) {
// 				if (grid[i][j] == val) {
// 					return false;
// 				}

// 			}

// 		}

// 		return true;
// 	}
// }
class Solution {
    public boolean helper(char[][] board, int row, int col){
        if(row == board.length){
            return true;
        }
        int nrow = 0;
        int ncol = 0;
        if(col != board.length -1) {
            nrow = row;
            ncol = col+1;
        }else{
            nrow = row+1;
            ncol = 0;
        }

        if(board[row][col] != '.'){
            if(helper(board, nrow, ncol)){
                return true;
            }
        }else{
            for(int i=1; i<=9; i++){
                if(isSafe(board, row, col, i)){
                    board[row][col] = (char)(i + '0');
                    if(helper(board, nrow, ncol)){
                        return true;
                    }else{
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false;

    }
    public boolean isSafe(char[][] board, int row, int col, int number){
        for(int i=0; i<board.length; i++){
            if(board[i][col] == (char)(number + '0')){
                return false;
            }
            if(board[row][i] == (char)(number +'0')){
                return false;
            }
        }
        //grid
        int sr = (row/3) *3;
        int sc = (col/3) *3;
        for(int i = sr; i<sr+3; i++){
            for(int j=sc; j< sc+3; j++){
                if(board[i][j] == (char)(number + '0')){
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
        
    }
}
