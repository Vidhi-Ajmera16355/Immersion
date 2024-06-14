package Classes;

import java.util.Arrays;

public class c2 {

	public static void main(String[] args) {
//		int[] a = {1,2,3,4};
//		int[] b = {10,20,30,40};
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(b));
//		swap(a);
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(b));
		
		int[] arr = {-2,3,1,-6,9,9};
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i] && smax!=max) {
				smax=max;
				max=arr[i];
				
			}
			else if(arr[i]!=max && smax<arr[i])
				smax=arr[i];
			
		}
		System.out.println(smax);	 
		
//		Arrays.sort(arr);
//		System.out.println(arr[arr.length-1]);
		
		
		
	}
	static void swap(int[] a) {
		int temp=a[0];
		a[0]=a[1];
		a[1]=temp;
	}

}
