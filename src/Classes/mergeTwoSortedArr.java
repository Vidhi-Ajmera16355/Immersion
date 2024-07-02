package Classes;

import java.util.Arrays;

public class mergeTwoSortedArr {

	public static void main(String[] args) {
		int[] a = {1,2,5};
		int[] b = {1,2,3,5};
//		Arrays.sort(b);
		int[] ans = mergeTwoSortedArrays(a,b);
		System.out.println(Arrays.toString(ans));
		int[] arr = {6,3,2,1,5,6,4,52,34};
		int[] ans2 = mergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(ans2));
	}
	
	public static int[] mergeSort(int[] arr,int s,int e) {
		if(s==e) {
			int[] a = new int[1];
			a[0] = arr [s];
			return a;
		}
		int mid = s+(e-s)/2;
		int[] left = mergeSort(arr,s,mid);
		int[] right = mergeSort(arr,mid+1,e);
		return mergeTwoSortedArrays(left,right);
	} 
	private static int[] mergeTwoSortedArrays(int[] a , int[] b) {
		int i,j,k;
		i=j=k=0;
		int[] ans = new int[a.length+b.length];
		while(i<a.length && j<b.length) {
			if(a[i]<=b[j]) {
				ans[k]=a[i];
				i++;
			}
			
			else {
				ans[k]=b[j];
				j++;
			}
			k++;
		}
		while(i<a.length) {
			ans[k++]=a[i];
			i++;
		}
		while(j<b.length) {
			ans[k++]=b[j];
			j++;
		}
		return ans;
	}
}