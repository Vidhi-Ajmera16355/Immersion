package Contest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
//		System.out.println(duplicate1(arr));
		sc.close();
		duplicate1(arr);
		}
	public static void duplicate1(int[] nums) { 
		ArrayList<Integer> ll = new ArrayList<>();
		for(int i=0;i<nums.length;i++){
			int idx = Math.abs(nums[i])-1; 
			if(nums[idx]>0){
				 nums[idx]*=-1;
			}
			else {
				ll.add(idx+1);
			}
		  }
		Collections.sort(ll);
		for(int i=0;i<ll.size();i++) {
			System.out.print(ll.get(i)+" ");
		}
	}
}