package Assignment1;

public class armstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(armstrongNumber(153));
	}
	static String armstrongNumber(int n){
        // code here
        int x=n;
        int len =(int) Math.log10(n)+1;
        int ans=0;
        while(n!=0){
            int rem = n%10;
            ans = ans+(int)Math.pow(rem,len);
            n/=10;
        }
        if(ans==x) return "Yes";
        return "No";
    }
}
