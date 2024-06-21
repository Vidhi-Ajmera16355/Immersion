package Classes;
import java.util.*;
public class sumOfDigitsofNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(sumOfDigits(n));
	}
	static int sumOfDigits(int N) {
        // code here
        if(N==1) return 1;
        
        return N%10+sumOfDigits(N/10);
}
}