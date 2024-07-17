package Graphs;
import java.util.*;
public class twoD {

	public static void main(String[] args) {
		int m=4;
		int n=4;
		int[][] arr = new int[m][n];
		int[][] mat = {{1,2,3,4},
				{5,6,7,8},
				{1,11,6,9},
				{4,6,3,2}};
		boolean[][] vis = new boolean[mat.length][mat[0].length];
		path(mat,mat.length,mat[0].length,0,0,vis);
	}

	private static void path(int[][] mat,int rows,int cols, int x,int y, boolean[][] visited) {
		visited[x][y] = true;
		System.out.print(mat[x][y]+" ");
		int[] r = {0,1,0,-1};
		int[] c = {1,0,-1,0};
		for(int i=0;i<r.length;i++){
			int nx = x+r[i];
			int ny = y+c[i];
			if(nx>=0 && nx<rows && ny>=0 && ny<cols && !visited[nx][ny]) {
				path(mat,rows,cols,nx,ny,visited);
			}
		}
		
	}

}
