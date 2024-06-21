package Classes;
import java.util.*;
public class power {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(power1(x,n));
	}
	private static int power(int x, int n){
		if(n==0) {
			return 1;
		}
		return x*power(x,n-1);
	}
	private static int power1(int x, int n){
		 if(n==0)
		   return 1;
		 int ans= power1(x,n/2);
		 if(n%2==0) {
			 return ans*ans;
		 }
		 return x*ans*ans;
	}
}