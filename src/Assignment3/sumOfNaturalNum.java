package Assignment3;
import java.util.*;
public class sumOfNaturalNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(result(n));
	}

	private static int result(int n) {
		if(n==1) {
			return 1;
		}
		return result(n-1)+n;
	}
}
