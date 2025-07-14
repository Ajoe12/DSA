import java.util.*;

public class B1_Valid_Sudoku {

	public static boolean cubeCheck(char[][] board,int iInd,int jInd){
        
        int[] hash = new int[9];
        for(int i=iInd;i<iInd+3;i++){
            for(int j=jInd;j<jInd+3;j++){
                if(board[i][j]=='.') continue;
                int dig = board[i][j]-'0'-1;
                if(hash[dig]==1) return false;
                hash[dig]=1;
            }
        }
        return true;
    }
    public static boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){

            int[] hashRow = new int[9];

            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                int dig = board[i][j]-'0'-1;
                if(hashRow[dig]==1) return false;
                hashRow[dig] = 1;
            }

            int[] hashCol = new int[9];
            for(int j=0;j<9;j++){
                if(board[j][i]=='.') continue;
                int dig = board[j][i]-'0'-1;
                if(hashCol[dig]==1) return false;
                hashCol[dig]=1;
            }
        }

        for(int i=0;i<=6;i=i+3){
            for(int j=0;j<=6;j=j+3){
                if(!cubeCheck(board,i,j)) {
                    return false;}
            }
        }
        return true;
    }
    
	public static void main(String[] args) {
		
		char[][] board = new char[][] {
			{'.','.','.','.','.','.','5','.','.'},
			{'.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.'},
			{'9','3','.','.','2','.','4','.','.'},
			{'.','.','7','.','.','.','3','.','.'},
			{'.','.','.','.','.','.','.','.','.'},
			{'.','.','.','3','4','.','.','.','.'},
			{'.','.','.','.','.','3','.','.','.'},
			{'.','.','.','.','.','5','2','.','.'}
		};
		
		System.out.println(isValidSudoku(board));

	}

}
