package Classes;
import java.util.*;
public class Place_A_and_B {

	public static void main(String[] args) {
		boolean[] arr = new boolean[5];
		place_AB1(4,2,"",arr,1);
		
	}
static void place_AB(int cars,int n , String ans,boolean[] arr) {
	if(n==0) {
		System.out.print(ans+" ");
		return;
	}
	for(int i=1;i<=4;i++) {
		if(arr[i]==false) {
			arr[i]=true;
			place_AB(cars,n-1,ans+"C"+i,arr);
			arr[i]=false;
		}
	}
}
static void place_AB1(int cars,int n , String ans,boolean[] arr,int idx) {
	if(n==0) {
		System.out.print(ans+" ");
		return;
	}
	for(int i=idx;i<=4;i++) {
		if(arr[i]==false) {
			arr[i]=true;
			place_AB1(cars,n-1,ans+"C"+i,arr,i+1);
			arr[i]=false;
		}
	}
}
}