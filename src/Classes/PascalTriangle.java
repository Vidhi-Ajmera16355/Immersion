package Classes;
import java.util.*;
public class PascalTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 6;
		for(int n=0;n<N;n++) {
			int nCr=1;
			for(int r=0;r<=n;r++) {
				System.out.print(nCr+ " ");
				nCr = ((n-r)*nCr)/(r+1);
				
			}
			System.out.println();
		}
	}
	private static int factorial(int n) {
		if(n==0 || n==1) return 1;
		return n*factorial(n-1);
	}
}
