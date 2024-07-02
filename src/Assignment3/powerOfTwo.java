package Assignment3;
import java.util.*;
public class powerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(power(n));
	}

	private static boolean power(int n){
		if(n==1){
			return true;
		}
		if(n%2==1) {
			return false;
		}
		return power(n/2);
		
		
	}

}
