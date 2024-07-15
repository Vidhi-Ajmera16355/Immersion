package Assignment3;

public class sudoku {

	public static void main(String[] args) {
		char[][] board = {
			    {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
			    {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
			    {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
			    {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
			    {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
			    {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
			    {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
			    {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
			    {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
			};
		solveSudoku(board);
	}
	    public static void solveSudoku(char[][] board){
	        solver(board,0,0);
	        display(board);
	    }
	    private static boolean solver(char[][] grid, int row, int col){
			if(col==grid[0].length){
				col=0;
				row=row+1;
			}
			if(row==grid.length){
				
				return true;
			}
	        boolean flag=false;
			if(grid[row][col]!='.'){
				flag=solver(grid,row,col+1);
			}
			else {
				for(char i='1';i<='9';i++){
					if(isvalid(grid,row,col,i)){
						grid[row][col]=i;
					flag=solver(grid,row,col+1);
	                if(flag==true){
	                    return true;
	                }
					grid[row][col]='.';
				}
				}
			}
	        return flag;
		}

		private static boolean isvalid(char[][] grid, int row, int col, char val) {
			int r=row;
			int c=col;
			for(int i=0;i<grid.length;i++) {
				if(grid[i][c]==val){
					return false;
				}
			}
			for(int i=0;i<grid[0].length;i++) {
				if(grid[r][i]==val){
					return false;
				}
			}
			 r=row-(row%3);
			 c=col-(col%3);
			for(int i=r;i<r+3;i++) {
				for(int j=c;j<c+3;j++) {
					if(grid[i][j]==val) return false;
				}
			}
			return true;
		}
		static void display(char[][] grid) {
			for(char i=0;i<grid.length;i++) {
				for(char j=0;j<grid[0].length;j++) {
					System.out.print(grid[i][j]+" ");
				}
				System.out.println();
			}
	}
}
