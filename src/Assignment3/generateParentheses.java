package Assignment3;
import java.util.*;
public class generateParentheses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> ans = new ArrayList<>();
		answer(n,ans,0,0,""); 
		System.out.println(ans);
    }
    static void answer(int n,List<String> ll,int open,int close,String s){
        if(open==n && close==n){
            ll.add(s);
            return;
        }
        if(open<n){
            answer(n,ll,open+1,close,s+"(");
        }
        if(close<open){
            answer(n,ll,open,close+1,s+")");
        } 
    }
}