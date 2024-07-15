package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class rottenOranges {
	public static void main(String[] args) {
		int[][] arr = { {2,1,1} , {1,1,0} , {0,1,1} };
		int rot=orangeRotting(arr);
		System.out.println(rot);
	}

	private static int orangeRotting(int[][] arr) {
		if(arr==null || arr.length==0) return 0;
		int rows = arr.length;
		int cols = arr[0].length;
		Queue<int[]> q = new LinkedList<>();
		int fresh=0;
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				if(arr[i][j]==2)
					q.offer(new int[] {i,j});
				if(arr[i][j]!=0) fresh++;
			}
		}
		if (fresh==0) return 0;
		int minCount=0,cnt=0;
		int[] dx = {0,0,1,-1};
		int[] dy = {1,-1,0,0};
		while(!q.isEmpty()) {
			
			int size=q.size();
			System.out.println("q"+size);
			cnt+=size;
			for(int i=0;i<size;i++) {
				int[]point = q.poll();
				for(int j=0;j<4;j++) {
					int x = point[0]+dx[j];
					int y = point[1]+dy[j];
					if(x<0 || y<0 || x>=rows || y>=cols || arr[x][y]==0 || arr[x][y]==2) 
					continue;
					arr[x][y]=2;
					q.offer(new int[] {x,y});
				}
			}
			if(q.size()!=0) minCount++;
		}
		return fresh==cnt? minCount:-1;
	}

}
