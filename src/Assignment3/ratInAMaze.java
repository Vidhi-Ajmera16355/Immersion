package Assignment3;
import java.util.*;
public class ratInAMaze {

	public static void main(String[] args) { 
			int[][] maze = {{1,0,0,0},
							{1,1,0,1},
							{1,1,0,0},
							{0,1,1,1}};
			print(0,0,maze,"");
		}

		static boolean isSafe(int i,int j,int n) {
			return (i>=0 && i<n && j>=0 && j<n);
		}
		private static void print(int i, int j, int[][] maze, String ans) {
			int n = maze.length;
			if((!isSafe(i,j,n)) ||maze[i][j]==0){
				return;
			}
			if(i==n-1 && j==n-1) {
				System.out.println(ans);
			}
			
			maze[i][j]=0;
			print(i+1,j,maze,ans+"D");
			print(i-1,j,maze,ans+"U");
			print(i,j-1,maze,ans+"L");
			print(i,j+1,maze,ans+"R");
			maze[i][j]=1;
		}

	}