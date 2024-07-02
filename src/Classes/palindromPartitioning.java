package Classes;

public class palindromPartitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "naman";
		palindrome(str,"");
	}
	static void palindrome(String que,String ans) {
		if(que.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int part=1;part<=que.length();part++) {
			String partition = que.substring(0,part);
			String remain = que.substring(part);
			if(isPalindrome(partition)) {
				palindrome(remain,ans+partition+" ");
			}
		}
	}
	static boolean isPalindrome(String str) {
		int st=0;
		int end = str.length()-1;
		while(st<end) {
			if(str.charAt(st)!=str.charAt(end)) {
				return false;
			}
			st++;
			end--;
		}
		return true;
	}
}
