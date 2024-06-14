package Assignment1;
import java.util.*;
public class trailingZeroes {
	public static void main(String[] args) {
		int n=375;
		int k=4;
		int k1 = (int)Math.pow(10,k);
		int g = gcd(n,k1);
		int lcm = (n*k1)/g;
		System.out.println(lcm);
	}
	static int gcd(int a ,int b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}
}