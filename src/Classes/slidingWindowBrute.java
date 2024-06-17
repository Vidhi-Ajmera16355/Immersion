package Classes;
import java.util.*;
public class slidingWindowBrute {

	static int max=0;
	public static void main(String[] args) {
		int[] arr = {1,8,30,-5,20,6};
		int k=3;
//		BRUTE FORCE
//		for(int i=0;i<k;i++) {
//			int sum=0;
//			for(int j=i;j<i+k;j++) {
//				sum+=arr[j];
//				max=Math.max(max, sum);
//			}
//	}
		slidingWindow(arr,k);
	}
	
	static void slidingWindow(int[] arr,int k) {
		int curr_sum=0;
		for(int i=0;i<k;i++) curr_sum+=arr[i];
		for(int i=k;i<arr.length;i++) {
			curr_sum+=arr[i]-arr[i-k];
			max=Math.max(max, curr_sum);
		}
		
		System.out.println(max);
	}
	
}
