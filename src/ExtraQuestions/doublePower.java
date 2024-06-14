package ExtraQuestions;

public class doublePower {

	public static void main(String[] args) {
		double x = 2.00000;
		int n = 10;
		System.out.println(myPow(x,n));
	}
	public static double myPow(double x, int n) {
        if(n==0) return 1;
        else if(n<0) return 1/(x*myPow(x,-n-1));
        else if(n%2==0){
            double a=myPow(x,n/2);
            return a*a;
        }
        return x*myPow(x,n-1);
    }
}
