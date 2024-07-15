package Assignment3;
import java.util.*;
public class binaryStrings{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		binary(n);
	}
	private static void binary(int n) {
		if(n==0)
			return;
		char[]ch = new char[n];
		ch[0]='0';
		generate(n,ch,1);
		ch[0]='1';
		generate(n,ch,1);
	}
	private static void generate(int n, char[] ch, int k) {
		if(n==k) {
			System.out.print(toString(ch)+" ");
			return;
		}
		if(ch[k-1]=='0') {
			ch[k]='0';
			generate(n,ch,k+1);
			ch[k]='1';
			generate(n,ch,k+1);
		}
		if(ch[k-1]=='1') {
			ch[k]='0';
			generate(n,ch,k+1);
		}
	}
	public static String toString(char[] a){
        String string = new String(a);
        return string;
    }
}