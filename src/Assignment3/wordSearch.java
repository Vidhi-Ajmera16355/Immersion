package Assignment3;
import java.util.*;
public class wordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = {
				{'A','B','C','E'},
				{'S','F','C','S'},
				{'A','D','E','E'}};
		String word = "ABCCED";
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				if(word.charAt(0)==board[i][j]) {
					if(answer(board,word,i,j,0))
						System.out.println("true");
				}
			}
		}
	}
	static boolean answer(char[][] board,String word,int i,int j,int idx) {
		if(i<0 ||j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(idx) || board[i][j]=='&') {
			return false;
		}
		if(idx==word.length()-1) {
			return true;
		}
		char temp = board[i][j];
		int[] r = {0,0,1,-1};
		int[] c = {-1,1,0,0};
		board[i][j]='&';
		for(int k=0;k<r.length;k++) {
			if(answer(board,word,i+r[k],j+c[k],idx+1))
				return true;
			
		}
		board[i][j]=temp;
		return false;
	}

}
