package Assignment1;
import java.util.*;
public class GCDandLCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int g = gcd(n,m);
		int h = lcm(n,m,g);
		System.out.println(g +" and "+h);
	}

	private static int lcm(int n, int m, int g) {
		return (n*m)/g;
	}

	private static int gcd(int a, int b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}
	

}
