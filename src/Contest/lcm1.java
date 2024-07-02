package Contest;
import java.util.*;
public class lcm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // input integer
            int x, y;

            if (n % 2 == 0) {
                x = y = n / 2;
            } else {
                x = 1;
                y = n - 1;
            }

            System.out.println(x + " " + y);
        }
}
}