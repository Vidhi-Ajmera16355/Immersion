package Classes;
import java.util.*;
public class mazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		path("",0,0,n);
	}
	static void path(String ans,int i, int j,int n) {
		if(i==n-1 && j==n-1) {
			System.out.print(ans+" ");
			return;
		}
		if(i==n || j==n) return;
		path(ans+"D",i+1,j,n);
		path(ans+"R",i,j+1,n);
	}

}
