package Classes;
import java.util.*;
public class sumOfFirstN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(sum(n));
	}
	private static int sum(int n) {
		if(n==1) return 1;
		
		int  ans=0;
		
		ans= sum(n-1)+n;
		System.out.println(ans);
		return ans;
	}
}