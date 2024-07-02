package Assignment3;
import java.util.*;
public class powerOf4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(answer(n));
	}

	private static boolean answer(int n) {
		if(n==1) {
			return true;
		}
		if(n%4!=0) {
			return false;
		}
		return answer(n/4);
	}

}
