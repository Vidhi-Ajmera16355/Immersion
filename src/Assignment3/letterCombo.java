package Assignment3;
import java.util.*;
public class letterCombo {
	static String[] phn ={"","","abc","def","ghi","jkl","mnno","pqrs","tuv","wxyz"};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		answer(s,phn,0,"");
	}
	private static void answer(String s, String[] phn2,int idx,String ans) {
		if(idx==s.length()) {
			System.out.println(ans);
			return;
		}
		char ch = s.charAt(idx);
		String str = phn2[ch-'0'];
		for(int i=0;i<str.length();i++) {
			answer(s,phn2,idx+1,ans+str.charAt(i));
		}
		
	}
}