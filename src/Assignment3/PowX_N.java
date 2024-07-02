package Assignment3;
import java.util.*;
public class PowX_N {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		int n = sc.nextInt();
		System.out.println(answer(x,n));
	}
	static double answer(double x,int n) {
		if(n==0) return 1;
		else if(n<0) return 1/(x*answer(x,-n-1));
		else if(n%2==0) {
			double a = answer(x,n/2);
			return a*a;
		}
		return answer(x,n-1)*x;
	}
}