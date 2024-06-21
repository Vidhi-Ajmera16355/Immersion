package Classes;
import java.util.*;

public class headTail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		coin(n,"");
	}

	private static void coin(int n, String ans) {
		if(n==0) {
			System.out.print(ans+" ");
			return;
		}
		coin(n-1,ans+"H");
		coin(n-1,ans+"T");
	}

}
