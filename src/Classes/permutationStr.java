package Classes;
import java.util.*;
public class permutationStr {

	public static void main(String[] args) {
		String str = "abc";
		permutation(str,"");
	}

	private static void permutation(String str, String ans) {
		if(str.length()==0) {
			System.err.print(ans+" ");
			return;
		}
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			permutation(str.substring(0,i)+str.substring(i+1),ans+ch);
		}
	}

}
