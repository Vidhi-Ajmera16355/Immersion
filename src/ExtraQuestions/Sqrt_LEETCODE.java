package ExtraQuestions;

public class Sqrt_LEETCODE {

	public static void main(String[] args) {
		System.out.println(mySqrt(64));
	}
	public static int mySqrt(int x) {
        if(x==0) return 0;
        if(x==1) return 1;
        for(int i=1;i<=x/2;i++){
            if((long)i*i==x) return (int) i;
            else if((long)i*i>x){
                return (int) i-1;
            }
        }
        return x/2;
    }
}
