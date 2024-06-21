package Classes;
import java.util.*;
public class palindromeRecursion {

	public static void main(String[] args) {
		String s = "abcba";
		System.out.println(check(s);
	}

	private static boolean check(String s) {
		char ch = s.charAt(0);
		if(ch==s.charAt(s.length()-1)) {
			
		}
	}
	

//	private static boolean check(String s,int i) {
//		if(s.length()==1){
//			return false;
//		}
//		int n=s.length()-1;
//		if(s.charAt(0)!=s.charAt(n)){
//			return check(s.substring(1),i-1);
//		}
//		return true;
//	}
}
