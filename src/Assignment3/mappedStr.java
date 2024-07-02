package Assignment3;
import java.util.*;
public class mappedStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String num = sc.next();
        printAllString(num, "");
    }
    public static void printAllString(String n, String ans) {
        if (n.length() == 0) {
            System.out.println(ans);
            return;
        }
        int num1 = Integer.parseInt(n.substring(0, 1));
        if (num1 >= 1 && num1 <= 26) {
            printAllString(n.substring(1), ans + (char) ('A' + num1 - 1));
        }
        if (n.length() > 1) {
            int num2 = Integer.parseInt(n.substring(0, 2));
            if (num2 >= 1 && num2 <= 26) {
                printAllString(n.substring(2), ans + (char) ('A' + num2 - 1));
            }
        }
    }
}