package ExtraQuestions;
import java.util.*;
public class Q2_evenlyDivides {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n  =sc.nextInt();
		int c=0;
		int x=n;
		while(n!=0) {
			int rem=n%10;
			if(rem!=0 && x%rem==0) {
				c++;
			}
			n/=10;
		}
		System.out.println(c);
	}

}
