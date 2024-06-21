package Classes;
import java.util.*;
public class GCD {

	public static void main(String[] args) {
		int a = 5;
		int b =10;
		System.out.println(gcd(a,b));
	}

	private static int gcd(int a, int b) {
		if(a==0) return b;
		return gcd(b%a , a);
	}

}
