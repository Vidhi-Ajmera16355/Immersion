package Classes;

public class c13 {

	public static void main(String[] args) {
		int N=5;
//		for(int n=0;n<N;n++) {
//			for(int r=0;r<=n;r++) {
//				int nCr = factorial(n)/(factorial(r)*factorial(n-r));
//				System.out.print(nCr+ " ");
//			}
//			System.out.println();
//		}
		
//		for(int n=0;n<N;n++) {
//			int nCr=1;
//			for(int r=0;r<=n;r++) {
//				System.out.print(nCr+ " ");
//				nCr = ((n-r)*nCr)/(r+1);
//				
//			}
//			System.out.println();
//		}

		int a=5;
		int b=15;
		for(int i=Math.min(a, b);i>=1;i--) {
			if(a%i ==0 && b%i==0) {
				System.out.println(i);
				break;
			}
		}
		gcd(a,b);
	}
	private static int gcd(int a,int b) {
		while(a>0 && b>0) {
			if(a>b) a=a%b;
			else b=b%a;
			if(a==0) return b;
			if(b==0) return a;
		}
		return 1;
	}
private static int factorial(int n) {
	int fact=1;
	while(n>0) {
		fact*=n--;
	}
	return fact;
}
}
