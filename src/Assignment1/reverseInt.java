package Assignment1;

public class reverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(123));
	}
	public static int reverse(int x) {
        if(x>Integer.MAX_VALUE || x<Integer.MIN_VALUE) return 0;
        int n = Math.abs(x);
        long rev=0;
        while(n!=0){
            rev=((rev*10)+(n%10));
            n/=10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE) return 0;
        return (int)(x<0 ? -rev : rev);
    }
}
