package BinarySearch;
import java.util.*;
public class searchElementInSortedArr {
//single element
//	XOR-------------------------------
	public static void main(String[] args) {
		int[] arr = {1,1,2,3,3,4,4,5,5};
		int n=arr.length;
		int l=0;
		int h=n-1;
		while(l<h) {
			int mid = l+(h-l)/2;
			boolean isEven;
			if((h-mid)%2==0) {
				isEven=true;
			}
			else {
				isEven=false;
			}
			if(arr[mid]==arr[mid+1]) {
				if(isEven) l=mid+2;
				else h=mid-1;
			}
			else {
				if(isEven) h=mid;
				else l=mid+1;
			}
		}
		System.out.println(arr[h]);
	}

	
}
