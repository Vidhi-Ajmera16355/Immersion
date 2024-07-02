package Assignment3;
import java.util.*;
public class CheckArrSorted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		System.out.println(answer(arr,0));
	}
	static int answer(int[] arr,int idx) {
		if(arr.length-1 <=idx) {
			return 1;
		}
		if(arr[idx]>arr[idx+1]) {
			return 0;
		}
		return answer(arr,idx+1);
	}
}