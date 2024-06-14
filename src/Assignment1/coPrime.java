package Assignment1;
import java.util.*;
public class coPrime {

	public static void main(String[] args) {
		int[] a = {5,10,20};
		System.out.println(countCoPrime(a,a.length));
	}
	static int countCoPrime(int a[], int n)
    {
        // Complete the function
        int c=0;
        List<Integer> res = new ArrayList<>();
        res.add(a[0]);
        for(int i=1;i<n;i++){
            if(gcd(res.get(res.size()-1),a[i])!=1){
                int insert = (res.get(res.size()-1)%2==0)? 5:5;
                res.add(insert);
                c++;
            }
            res.add(a[i]);
        }
        return c;
    }
    static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
