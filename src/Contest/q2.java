package Contest;
import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans=0;
        int pos=1;
        while (num>0) {
            int rem=num % 10;
            ans+= pos*(int)Math.pow(10,rem-1);
            num/=10;
            pos++;
        }
        System.out.println(ans);
    }
}