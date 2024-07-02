package Contest;
import java.util.*;
public class lcm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = 1;
            int y = n - 1;
            int min = Integer.MAX_VALUE;
            int X = 1, Y = n - 1;
            for (int i = 1; i <= n / 2; i++) {
            	int a = n / 2;
                int b = n - a;
                int lcmValue = lcm(a, b);
                if (lcmValue < min) {
                    min = lcmValue;
                    X = a;
                    Y = b;
                }
            }
            System.out.println(X+" "+Y);
        }
    }
    private static int lcm(int x, int y) {
        return (x * y) / gcd(x, y);
    }
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
