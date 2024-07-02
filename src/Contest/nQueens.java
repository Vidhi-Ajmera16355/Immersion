package Contest;
import java.util.*;
public class nQueens {
static int c=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x=n-1;
		char[][] grid = new char[n][n];
		answer(grid,x,0);
		System.out.println(c);
	}

	private static void answer(char[][] grid,int n, int row) {
		if(row==grid.length) {
			return;
		}
		if(n==0) {
			c++;
			return;
		}
		for(int col=0;col<n;col++){
			if(isSafe(grid,row,col)) {
				grid[row][col]='Q';
				answer(grid,n-1,row);
				grid[row][col]='.';
			}
		}
	}

	private static boolean isSafe(char[][] board, int row, int col) {
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
		for(int i=row-1,j=col+1;i>=0 && j<board[0].length;i--,j++){
			if(board[i][col]=='Q') {
				return false;
			}
		}
		return true;
	}
}
