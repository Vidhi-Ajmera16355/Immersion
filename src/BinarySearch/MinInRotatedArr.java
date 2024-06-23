package BinarySearch;
import java.util.*;
public class MinInRotatedArr {

	public static void main(String[] args) {
		int[] arr = {3,4,5,1,2};
		int l=0;
		int r=arr.length-1;
		while(l<r) {
			int mid = l+(r-l)/2;
			if(arr[mid]>arr[r]) {
				l=mid+1;
			}
			else {
				r=mid;
			}
		}
		System.out.println(arr[r]);
	}

}
