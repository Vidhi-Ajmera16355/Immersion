package Assignment3;
import java.util.*;
public class FirstUpperCaseLetterInStr{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(answer(str));
	}

	private static char answer(String str){
		if(str.length()==0)
			return 0;
			if(Character.isUpperCase(str.charAt(0)))
				return str.charAt(0);
			return answer(str.substring(1));	
	}
}
