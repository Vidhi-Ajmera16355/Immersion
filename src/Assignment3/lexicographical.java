package Assignment3;
import java.util.*;
public class lexicographical {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		answer(n,0);
	}

	private static void answer(int n, int cur) {
		if(n<cur) return;
		if(cur!=0) {
			System.out.print(cur+" ");
		}
		int st=0;
		if(cur==0) st=1;
		for(int i=st;i<=9;i++) {
			answer(n,cur*10+i);
		}
	}

}
