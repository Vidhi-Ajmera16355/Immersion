package Assignment3;
import java.util.*;
public class replace0With5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(answer(n));
	}

	private static int answer(int n ) {
		if (n == 0) {
            return 0; // Base case: replace 0 with 5
        }
        int lastDigit = n % 10;
        if(lastDigit==0) {
        	lastDigit=5;
        }
        return answer(n / 10) * 10 + lastDigit;
	}
}