package Assignment3;
import java.util.*;
public class Geek_onacciNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int n=sc.nextInt();
		    System.out.println(fib(n,a,b,c));
		}
	}
	static int fib(int n,int a,int b,int c){
	    if(n==1){
	        return a;
	    }
	    if(n==2){
	        return b;
	    }
	    if(n==3){
	        return c;
	    }
	    return fib(n-1,a,b,c)+fib(n-2,a,b,c)+fib(n-3,a,b,c);
	}
}