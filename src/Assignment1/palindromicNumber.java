package Assignment1;

public class palindromicNumber {
	public static void main(String[] args){
		System.out.println(isPalindrome(121));
	}
	public static  boolean isPalindrome(int x) {
        int n=x;
        int rev=0;
        if(x<0) return false;
        while(n!=0){
            rev=((rev*10)+(n%10));
            n/=10;
        }
        if(rev==x) return true;
        return false;
    }
}