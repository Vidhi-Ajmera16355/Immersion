package Classes;

public class NQueens {
static int c=0;

	public static void main(String[] args) {
		int n = 1;
		char[][] board = new char[2][2];
		queen(board,n,0);
		System.out.println(c);
	}

	private static void queen(char[][] board, int n, int row) {
		if(row>=n) {
			return;
		}
		if(row>n) return;
		for(int col=0;col<n;col++) {
			if(isSafe(board,n,row,col)){
				c++;
				board[row][col]='Q';
				queen(board,n,row+1);
				
			}
		}
	}

	private static boolean isSafe(char[][] board,int n, int row, int col) {
		for(int i=row-1;i>=0;i--) {
			if(board[i][col]=='Q') {
				return false;
			}
		}
		for(int i=row-1, j=col-1 ;i>=0 && j>=0 ;i--,j--) {
			if(board[i][col]=='Q') {
				return false;
			}
		} 
		for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
			if(board[i][col]=='Q') {
				return false;
			}
		}
		return true;
	}

}
