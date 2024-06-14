package ExtraQuestions;
import java.util.*;
public class Q1_countDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n  =sc.nextInt();
//		Formula Approach
		System.out.println((int) Math.log10(n)+1);
//		Loop Approach
		int c = 0;
		while(n!=0) {
			int rem=n%10;
			c++;
			n/=10;
		}
		System.out.println(c);
	}

}
